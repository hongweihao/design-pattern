package pri.hongweihao.ch10.ch10_01;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import pri.hongweihao.ch10.common.UserBO;

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

    public String userCreate(UserBO userBO) throws Exception {
        String json = objectMapper.writeValueAsString(userBO);

        RequestBody requestBody = RequestBody.create(json, MediaType.get("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url("https://mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7/api/user")
                .post(requestBody)
                .build();

        OkHttpClient httpClient = new OkHttpClient();
        try (Response response = httpClient.newCall(request).execute()) {
            if (response.code() != 200) {
                return null;
            }

            String responseBody = Objects.requireNonNull(response.body()).string();
            JsonNode jsonNode = objectMapper.readValue(responseBody, JsonNode.class);
            if (!jsonNode.get("ok").asBoolean()) {
                System.out.println("failed to send request");
                return null;
            }
            return jsonNode.get("data").asText();
        }
    }

    public boolean userDelete(String userId) throws IOException {
        Request request = new Request.Builder()
                .url("https://mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7/api/user/" +  userId)
                .delete()
                .build();

        OkHttpClient httpClient = new OkHttpClient();
        try (Response response = httpClient.newCall(request).execute()) {
            if (response.code() != 200) {
                return false;
            }

            String responseBody = Objects.requireNonNull(response.body()).string();
            JsonNode jsonNode = new ObjectMapper().readValue(responseBody, JsonNode.class);
            if (!jsonNode.get("ok").asBoolean()) {
                System.out.println("failed to send request");
                return false;
            }
            return true;
        }
    }

    public boolean userUpdate(UserBO userBO) throws IOException {
        String json = objectMapper.writeValueAsString(userBO);

        RequestBody requestBody = RequestBody.create(json, MediaType.get("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url("https://console-mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7/api/user")
                .put(requestBody)
                .build();

        OkHttpClient httpClient = new OkHttpClient();
        try (Response response = httpClient.newCall(request).execute()) {
            if (response.code() != 200) {
                return false;
            }

            String responseBody = Objects.requireNonNull(response.body()).string();
            JsonNode jsonNode = objectMapper.readValue(responseBody, JsonNode.class);
            if (!jsonNode.get("ok").asBoolean()) {
                System.out.println("failed to send request");
                return false;
            }
            return true;
        }
    }

    public UserBO userQuery(String userId) throws IOException {
        Request request = new Request.Builder()
                .url("https://console-mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7/api/user/" + userId)
                .get()
                .build();

        OkHttpClient httpClient = new OkHttpClient();
        try (Response response = httpClient.newCall(request).execute()) {
            if (response.code() != 200) {
                return null;
            }

            String responseBody = Objects.requireNonNull(response.body()).string();
            JsonNode jsonNode = objectMapper.readValue(responseBody, JsonNode.class);
            if (!jsonNode.get("ok").asBoolean()) {
                System.out.println("failed to send request");
                return null;
            }

            String data = jsonNode.get("data").get("user").asText();
            return objectMapper.readValue(data, UserBO.class);
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