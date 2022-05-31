package pri.hongweihao.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 新用户主题
 * </p>
 *
 * @author Karl
 * @date 2022/5/31 9:20
 */
public class NewUserSubject implements Subject {
    private final List<NewUserObserver> observers;

    public NewUserSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public boolean addObserver(NewUserObserver observer) {
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(NewUserObserver observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NewUserObserver observer : observers) {
            observer.notify("new_user_id");
        }
    }
}
