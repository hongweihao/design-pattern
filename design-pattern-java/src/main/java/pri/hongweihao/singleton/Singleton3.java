package pri.hongweihao.singleton;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * 懒汉式单例 双重锁检测
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 14:48
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton3.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
