package pri.hongweihao.adapter;

/**
 * <p>
 * 类适配器，通过继承的方式
 * </p>
 *
 * @author Karl
 * @date 2022/6/10 10:22
 */
public class ExtUserQueryAdapter extends UserCenterQuery implements IUserQuery {
    @Override
    public Object queryById(String userId) {
        String id = selectOpenIdByUserId(userId);
        return super.queryById(id);
    }

    private String selectOpenIdByUserId(String userId) {
        return "openId";
    }
}
