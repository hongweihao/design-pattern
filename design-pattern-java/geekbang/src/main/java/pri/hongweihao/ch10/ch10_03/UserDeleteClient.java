package pri.hongweihao.ch10.ch10_03;

import pri.hongweihao.ch10.ch10_03.request.UserDeleteClientRequest;
import pri.hongweihao.ch10.ch10_03.response.UserDeleteClientResponse;
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
public class UserDeleteClient extends AbstractUserClient<UserDeleteClientResponse, UserDeleteClientRequest> {
    @Override
    protected HttpMethodEnum getMethod() {
        return HttpMethodEnum.PUT;
    }

    @Override
    protected HttpRequest createHttpRequest(UserDeleteClientRequest req) {
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setUrl("https://console-mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7//api/user");

        Map<String, Object> body = new HashMap<>();
        body.put("user_id", req.getUserId());
        httpRequest.setBody(body);

        return httpRequest;
    }

    @Override
    protected UserDeleteClientResponse createRes() {
        return new UserDeleteClientResponse();
    }

    public static void main(String[] args) throws IOException {
        UserDeleteClientRequest req= new UserDeleteClientRequest();
        req.setUserId("84hfkhhrhj7");
        UserDeleteClientResponse res = new UserDeleteClient().execute(req);
        System.out.println(res.isOk());
    }
}