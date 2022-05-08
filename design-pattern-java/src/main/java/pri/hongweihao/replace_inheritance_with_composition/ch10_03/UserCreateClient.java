package pri.hongweihao.replace_inheritance_with_composition.ch10_03;

import com.fasterxml.jackson.databind.JsonNode;
import pri.hongweihao.replace_inheritance_with_composition.ch10_03.request.UserCreateClientRequest;
import pri.hongweihao.replace_inheritance_with_composition.ch10_03.response.UserCreateClientResponse;
import pri.hongweihao.replace_inheritance_with_composition.common.HttpMethodEnum;
import pri.hongweihao.replace_inheritance_with_composition.common.HttpRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户请求客户端
 * </p>
 *
 * @author Karl
 * @date 2022/3/11 9:10
 */
public class UserCreateClient extends AbstractUserClient<UserCreateClientResponse, UserCreateClientRequest> {

    @Override
    protected HttpMethodEnum getMethod() {
        return HttpMethodEnum.POST;
    }

    @Override
    protected HttpRequest createHttpRequest(UserCreateClientRequest req) {
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setUrl("https://console-mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7/api/user");

        Map<String, Object> body = new HashMap<>();
        body.put("user_name", req.getUserName());
        body.put("other", req.getOther());
        httpRequest.setBody(body);

        return httpRequest;
    }

    @Override
    protected UserCreateClientResponse createRes() {
        return new UserCreateClientResponse();
    }

    @Override
    protected void parseRes(JsonNode dataNode, UserCreateClientResponse res) {
        res.setUserId(dataNode.asText());
    }

    public static void main(String[] args) throws IOException {
        UserCreateClientRequest req= new UserCreateClientRequest();
        req.setUserName("pri/hongweihao");
        req.setOther("xxxxx");
        UserCreateClientResponse res = new UserCreateClient().execute(req);
        System.out.println(res.getUserId());
    }
}