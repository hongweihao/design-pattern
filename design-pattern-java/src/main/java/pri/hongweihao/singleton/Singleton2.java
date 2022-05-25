package pri.hongweihao.singleton;

import java.util.Objects;

/**
 * <p>
 * 懒汉式单例
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 14:48
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton2();
        }
        return instance;
    }
}
