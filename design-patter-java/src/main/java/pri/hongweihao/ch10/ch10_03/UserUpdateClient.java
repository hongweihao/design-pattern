package pri.hongweihao.ch10.ch10_03;

import com.fasterxml.jackson.databind.JsonNode;
import pri.hongweihao.ch10.ch10_03.request.UserCreateClientRequest;
import pri.hongweihao.ch10.ch10_03.request.UserUpdateClientRequest;
import pri.hongweihao.ch10.ch10_03.response.UserCreateClientResponse;
import pri.hongweihao.ch10.ch10_03.response.UserUpdateClientResponse;
import pri.hongweihao.ch10.common.HttpMethodEnum;
import pri.hongweihao.ch10.common.HttpRequest;

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
public class UserUpdateClient extends AbstractUserClient<UserUpdateClientResponse, UserUpdateClientRequest> {

    @Override
    protected HttpMethodEnum getMethod() {
        return HttpMethodEnum.PUT;
    }

    @Override
    protected HttpRequest createHttpRequest(UserUpdateClientRequest req) {
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setUrl("https://console-mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7//api/user");

        Map<String, Object> body = new HashMap<>();
        body.put("user_id", req.getUserId());
        body.put("user_name", req.getUserName());
        body.put("other", req.getOther());
        httpRequest.setBody(body);

        return httpRequest;
    }

    @Override
    protected UserUpdateClientResponse createRes() {
        return new UserUpdateClientResponse();
    }

    public static void main(String[] args) throws IOException {
        UserUpdateClientRequest req= new UserUpdateClientRequest();
        req.setUserName("hongweihao");
        req.setOther("xxxxx");
        UserUpdateClientResponse res = new UserUpdateClient().execute(req);
        System.out.println(res.isOk());
    }
}