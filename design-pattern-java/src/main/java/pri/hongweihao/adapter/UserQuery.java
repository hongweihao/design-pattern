package pri.hongweihao.adapter;

public class UserQuery implements IUserQuery {
    @Override
    public Object queryById(Long id) {
        System.out.println("使用数值型id查询用户信息: " + id);
        return new Object();
    }
}
