package pri.hongweihao.adapter;

public class NewUserQuery implements INewUserQuery {
    @Override
    public Object queryById(String openId) {
        System.out.println("使用字符串id查询用户信息: " + openId);
        return new Object();
    }
}
