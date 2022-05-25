package pri.hongweihao.singleton;

/**
 * <p>
 * 饿汉式单例
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 14:48
 */
public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
