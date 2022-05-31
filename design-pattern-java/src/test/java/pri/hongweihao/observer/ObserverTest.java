package pri.hongweihao.observer;

import org.junit.Test;

/**
 * <p>
 * 观察者模式测试类
 * </p>
 *
 * @author Karl
 * @date 2022/5/31 9:29
 */
public class ObserverTest {
    @Test
    public void test() {
        AllMembersGroupObserver allMembersGroupObserver = new AllMembersGroupObserver();
        PersistentConnectionObserver persistentConnectionObserver = new PersistentConnectionObserver();
        WelcomeMessageObserver welcomeMessageObserver = new WelcomeMessageObserver();

        NewUserSubject newUserSubject = new NewUserSubject();
        newUserSubject.addObserver(allMembersGroupObserver);
        newUserSubject.addObserver(persistentConnectionObserver);
        newUserSubject.addObserver(welcomeMessageObserver);
        newUserSubject.notifyObservers();

        System.out.println("-----");
        newUserSubject.removeObserver(persistentConnectionObserver);
        newUserSubject.notifyObservers();
    }
}
