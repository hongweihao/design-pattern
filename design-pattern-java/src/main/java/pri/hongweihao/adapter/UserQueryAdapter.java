package pri.hongweihao.adapter;

public class UserQueryAdapter implements INewUserQuery {
    private final IUserQuery userQuery;

    public UserQueryAdapter(IUserQuery userQuery) {
        this.userQuery = userQuery;
    }

    @Override
    public Object queryById(String openId) {
        Long id = selectByOpenId(openId);
        return userQuery.queryById(id);
    }

    private Long selectByOpenId(String openId) {
        return 1001L;
    }
}
