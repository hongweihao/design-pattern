package pri.hongweihao.adapter;

/**
 * <p>
 * 对象适配器，通过组合的方式
 * </p>
 *
 * @author Karl
 * @date 2022/6/10 10:22
 */
public class UserCenterQueryAdapter implements IUserQuery {
    private final UserCenterQuery userCenterQuery;

    public UserCenterQueryAdapter(UserCenterQuery userCenterQuery) {
        this.userCenterQuery = userCenterQuery;
    }

    @Override
    public Object queryById(String userId) {
        // 把旧的userId转换成用户中心的openId
        String openId = selectOpenIdByUserId(userId);
        return userCenterQuery.queryById(openId);
    }

    private String selectOpenIdByUserId(String userId) {
        return "openId";
    }
}
