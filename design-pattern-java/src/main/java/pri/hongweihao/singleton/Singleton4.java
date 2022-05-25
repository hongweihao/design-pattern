package pri.hongweihao.singleton;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * 静态内部类单例
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 14:48
 */
public class Singleton4 {
    private Singleton4() {
    }

    static class Holder {
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Holder.instance;
    }
}
