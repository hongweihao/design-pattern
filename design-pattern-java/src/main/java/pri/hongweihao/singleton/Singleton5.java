package pri.hongweihao.singleton;

/**
 * <p>
 * 枚举单例
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 14:48
 */
public enum Singleton5 {
    instance;

    public static Singleton5 getInstance() {
        return instance;
    }
}
