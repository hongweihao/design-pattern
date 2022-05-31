package pri.hongweihao.observer;

/**
 * <p>
 * 新注册用户加入全员群
 * </p>
 *
 * @author Karl
 * @date 2022/5/31 9:16
 */
public class AllMembersGroupObserver implements NewUserObserver {
    @Override
    public void notify(String userId) {
        System.out.printf("把新用户 %s 拉入全员群\n", userId);
    }
}
