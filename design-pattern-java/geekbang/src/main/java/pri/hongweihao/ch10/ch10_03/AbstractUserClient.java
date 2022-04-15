package pri.hongweihao.ch10.ch10_03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import pri.hongweihao.ch10.ch10_03.request.AbstractUserClientRequest;
import okhttp3.*;
import pri.hongweihao.ch10.ch10_03.response.AbstractUserClientResponse;
import pri.hongweihao.ch10.common.HttpMethodEnum;
import pri.hongweihao.ch10.common.HttpRequest;
import pri.hongweihao.ch10.exception.BusinessInvokeException;
import pri.hongweihao.ch10.exception.HttpCodeNotExpectedException;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author Karl
 * @date 2022/3/23 17:56
 */
public abstract class AbstractUserClient<RES extends AbstractUserClientResponse, REQ extends AbstractUserClientRequest> {
    private final ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);

    private Request generateRequest(REQ req) throws JsonProcessingException {
        HttpRequest httpRequest = this.createHttpRequest(req);

        Request.Builder builder = new Request.Builder();

        if (!Objects.isNull(httpRequest.getQuery()) && httpRequest.getQuery().size() > 0) {
            String query = httpRequest.getQuery().entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&"));
            HttpUrl httpUrl = HttpUrl.get(httpRequest.getUrl() + "?" + query);
            builder.url(httpUrl);
        } else {
            builder.url(HttpUrl.get(httpRequest.getUrl()));
        }

        if (!Objects.isNull(httpRequest.getHeader()) && httpRequest.getHeader().size() > 0) {
            for (Map.Entry<String, String> entry : httpRequest.getHeader().entrySet()) {
                builder.header(entry.getKey(), entry.getValue());
            }
        }

        if (!Objects.isNull(httpRequest.getBody()) && httpRequest.getBody().size() > 0) {
            String body = objectMapper.writeValueAsString(httpRequest.getBody());
            RequestBody requestBody = RequestBody.create(body, MediaType.get("application/json; charset=utf-8"));
            builder.method(getMethod().name(), requestBody);
        }
        return builder.build();
    }

    public RES execute(REQ req) throws IOException, HttpCodeNotExpectedException, BusinessInvokeException {
        RES res = createRes();

        Request request = generateRequest(req);
        OkHttpClient httpClient = new OkHttpClient();

        String responseBody;
        try (Response response = httpClient.newCall(request).execute()) {
            if (response.code() != 200) {
                res.setMsg("http code Not expected: " + response.code());
                throw new HttpCodeNotExpectedException(response.code());
            }
            responseBody = Objects.requireNonNull(response.body()).string();
        }

        JsonNode jsonNode = objectMapper.readValue(responseBody, JsonNode.class);
        if (!jsonNode.get("ok").asBoolean()) {
            String msg = jsonNode.get("msg").asText();
            res.setMsg("http code Not expected: " + msg);
            throw new BusinessInvokeException(msg);
        }

        res.setOk(true);
        parseRes(jsonNode.get("data"), res);
        return res;
    }

    protected abstract HttpMethodEnum getMethod();

    protected abstract HttpRequest createHttpRequest(REQ req);

    protected abstract RES createRes();

    protected void parseRes(JsonNode dataNode, RES res) {}
}
