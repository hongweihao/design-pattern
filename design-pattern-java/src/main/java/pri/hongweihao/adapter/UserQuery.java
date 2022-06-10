package pri.hongweihao.adapter;

/**
 * <p>
 * 从用户表中获取用户信息
 * </p>
 *
 * @author Karl
 * @date 2022/6/10 10:33
 */
public class UserQuery implements IUserQuery {
    @Override
    public Object queryById(String userId) {
        System.out.println("使用userId查询用户表中的用户信息: " + userId);
        return new Object();
    }
}
