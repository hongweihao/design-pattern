package pri.hongweihao.observer;

/**
 * <p>
 * 新用户加入后，通过长连接通知客户端刷新通讯录
 * </p>
 *
 * @author Karl
 * @date 2022/5/31 9:16
 */
public class PersistentConnectionObserver implements NewUserObserver {
    @Override
    public void notify(String userId) {
        System.out.printf("发送长连接通知给客户端，新用户：%s\n", userId);
    }
}
