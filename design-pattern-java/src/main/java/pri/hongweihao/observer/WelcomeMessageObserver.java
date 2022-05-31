package pri.hongweihao.observer;

/**
 * <p>
 * 新用户注册后，小助手发送一条欢迎消息
 * </p>
 *
 * @author Karl
 * @date 2022/5/31 9:16
 */
public class WelcomeMessageObserver implements NewUserObserver {
    @Override
    public void notify(String userId) {
        System.out.printf("通过小助手发送欢迎消息给新用户：%s\n", userId);
    }
}
