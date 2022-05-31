package pri.hongweihao.observer;

/**
 * <p>
 * 观察者接口
 * </p>
 *
 * @author Karl
 * @date 2022/5/31 9:25
 */
public interface Observer {
    void notify(String payload);
}
