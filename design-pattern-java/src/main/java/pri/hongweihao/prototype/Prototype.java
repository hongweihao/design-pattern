package pri.hongweihao.prototype;

/**
 * <p>
 * 原型模式
 * </p>
 *
 * @author Karl
 * @date 2022/5/24 17:41
 */
public class Prototype implements Cloneable {
    public String key;
    public Inner inner;

    public Prototype() {
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public void print() {
        System.out.println("key: " + this.key);
        System.out.println("inner: " + inner.name);
    }

    public static class Inner {
        public String name;

        public Inner(String name) {
            this.name = name;
        }
    }
}
