package pri.hongweihao.replace_inheritance_with_composition.ch10_02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import pri.hongweihao.replace_inheritance_with_composition.common.UserBO;
import pri.hongweihao.replace_inheritance_with_composition.exception.BusinessInvokeException;
import pri.hongweihao.replace_inheritance_with_composition.exception.HttpCodeNotExpectedException;

import java.io.IOException;
import java.util.Objects;

/**
 * <p>
 * 用户请求客户端
 * </p>
 *
 * @author Karl
 * @date 2022/3/11 9:10
 */
public class UserClient {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public String userCreate(UserBO userBO) throws JsonProcessingException {
        String json = objectMapper.writeValueAsString(userBO);

        RequestBody requestBody = RequestBody.create(json, MediaType.get("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url("https://mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7/api/user")
                .post(requestBody)
                .build();
        try {
            return execute(request).asText();
        } catch (Exception e) {
            return null;
        }
    }

    public boolean userDelete(String userId) {
        Request request = new Request.Builder()
                .url("https://mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7/api/user/" + userId)
                .delete()
                .build();

        try {
            execute(request);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean userUpdate(UserBO userBO) throws IOException {
        String json = objectMapper.writeValueAsString(userBO);

        RequestBody requestBody = RequestBody.create(json, MediaType.get("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url("https://console-mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7/api/user")
                .put(requestBody)
                .build();

        try {
            execute(request);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public UserBO userQuery(String userId) {
        Request request = new Request.Builder()
                .url("https://console-mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7/api/user/" + userId)
                .get()
                .build();

        JsonNode data;

        try {
            data = execute(request);
        } catch (Exception e) {
            return null;
        }
        return objectMapper.convertValue(data.get("user"), UserBO.class);
    }

    private JsonNode execute(Request request) throws IOException, HttpCodeNotExpectedException, BusinessInvokeException {
        OkHttpClient httpClient = new OkHttpClient();
        try (Response response = httpClient.newCall(request).execute()) {
            if (response.code() != 200) {
                throw new HttpCodeNotExpectedException(response.code());
            }

            String responseBody = Objects.requireNonNull(response.body()).string();
            JsonNode jsonNode = objectMapper.readValue(responseBody, JsonNode.class);
            if (!jsonNode.get("ok").asBoolean()) {
                throw new BusinessInvokeException(jsonNode.get("data").asText());
            }

            return jsonNode.get("data");
        }
    }

    public static void main(String[] args) throws Exception {
        UserClient userClient = new UserClient();
        UserBO userBO = new UserBO();
        userBO.setUserName("pri/hongweihao");
        userBO.setOther("xxxxxxx");
        System.out.println(userClient.userCreate(userBO));

        boolean deleted = userClient.userDelete("84hfkhhrhj7");
        System.out.println(deleted);

        UserBO userBOU = new UserBO();
        userBOU.setUserName("pri/hongweihao");
        userBOU.setOther("xxxxxxx");
        System.out.println(userClient.userUpdate(userBO));

        UserBO result = userClient.userQuery("84hfkhhrhj7");
        System.out.println(result.getUserId());
        System.out.println(result.getUserName());
        System.out.println(result.getOther());
    }
}