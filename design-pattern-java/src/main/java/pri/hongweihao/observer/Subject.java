package pri.hongweihao.observer;

/**
 * <p>
 * 主题接口
 * </p>
 *
 * @author Karl
 * @date 2022/5/31 9:18
 */
public interface Subject {
    boolean addObserver(NewUserObserver observer);

    boolean removeObserver(NewUserObserver observer);

    void notifyObservers();
}
