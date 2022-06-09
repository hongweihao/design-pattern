package pri.hongweihao.adapter;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void test() {
        INewUserQuery newUserQuery = new NewUserQuery();
        newUserQuery.queryById("openId");

        // 对象适配器，组合
        UserQuery userQuery = new UserQuery();
        INewUserQuery userQueryAdapter = new UserQueryAdapter(userQuery);
        userQueryAdapter.queryById("openId");

        // 类适配器，继承
        INewUserQuery extUserQueryAdapter = new ExtUserQueryAdapter();
        extUserQueryAdapter.queryById("openId");

    }
}
