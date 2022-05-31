package pri.hongweihao.observer;

/**
 * <p>
 * 新用户观察者接口
 * </p>
 *
 * @author Karl
 * @date 2022/5/31 9:14
 */
public interface NewUserObserver extends Observer {
    void notify(String userId);
}
