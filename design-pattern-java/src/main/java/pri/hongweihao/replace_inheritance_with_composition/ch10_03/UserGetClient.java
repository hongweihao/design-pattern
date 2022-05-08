package pri.hongweihao.replace_inheritance_with_composition.ch10_03;

import pri.hongweihao.replace_inheritance_with_composition.ch10_03.request.UserGetClientRequest;
import pri.hongweihao.replace_inheritance_with_composition.ch10_03.response.UserGetClientResponse;
import pri.hongweihao.replace_inheritance_with_composition.common.HttpMethodEnum;
import pri.hongweihao.replace_inheritance_with_composition.common.HttpRequest;

import java.io.IOException;

/**
 * <p>
 * 用户请求客户端
 * </p>
 *
 * @author Karl
 * @date 2022/3/11 9:10
 */
public class UserGetClient extends AbstractUserClient<UserGetClientResponse, UserGetClientRequest> {

    @Override
    protected HttpMethodEnum getMethod() {
        return HttpMethodEnum.GET;
    }

    @Override
    protected HttpRequest createHttpRequest(UserGetClientRequest req) {
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setUrl("https://console-mock.apipost.cn/app/mock/project/45824d9f-d4c3-4e61-b5d3-23347a90a1e7//api/user/" + req.getUserId());
        return httpRequest;
    }

    @Override
    protected UserGetClientResponse createRes() {
        return new UserGetClientResponse();
    }

    public static void main(String[] args) throws IOException {
        UserGetClientRequest req= new UserGetClientRequest();
        req.setUserId("84hfkhhrhj8");
        UserGetClientResponse res = new UserGetClient().execute(req);
        System.out.println(res.isOk());
    }
}