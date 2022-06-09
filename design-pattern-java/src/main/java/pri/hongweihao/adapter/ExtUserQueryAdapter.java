package pri.hongweihao.adapter;

public class ExtUserQueryAdapter extends UserQuery implements INewUserQuery {
    @Override
    public Object queryById(String openId) {
        Long id = selectByOpenId(openId);
        return super.queryById(id);
    }

    private Long selectByOpenId(String openId) {
        return 1001L;
    }
}
