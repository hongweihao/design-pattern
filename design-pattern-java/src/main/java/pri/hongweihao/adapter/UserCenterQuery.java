package pri.hongweihao.adapter;

/**
 * <p>
 * 从用户中心获取用户信息
 * </p>
 *
 * @author Karl
 * @date 2022/6/10 10:32
 */
public class UserCenterQuery implements IUserQuery {
    @Override
    public Object queryById(String openId) {
        System.out.println("使用openId通过用户中心查询用户信息: " + openId);
        return new Object();
    }
}
