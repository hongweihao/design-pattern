package pri.hongweihao.adapter;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void test() {
        // 旧的方式，使用userId直接查询用户表的信息
        UserQuery userQuery = new UserQuery();
        userQuery.queryById("userId");

        // 适配：通过用户中心查询用户信息
        UserCenterQuery userCenterQuery = new UserCenterQuery();

        // 对象适配器，组合
        IUserQuery userQueryAdapter = new UserCenterQueryAdapter(userCenterQuery);
        userQueryAdapter.queryById("userId");

        // 类适配器，继承
        IUserQuery extUserQueryAdapter = new ExtUserQueryAdapter();
        extUserQueryAdapter.queryById("userId");
    }
}
