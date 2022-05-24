package pri.hongweihao.prototype;

import org.junit.Test;

/**
 * <p>
 * 原型模式测试类
 * </p>
 *
 * @author Karl
 * @date 2022/5/24 17:50
 */
public class PrototypeTest {
    @Test
    public void test() throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.key = "111";
        prototype.inner = new Prototype.Inner("aaa");
        System.out.println("打印prototype对象：");
        prototype.print();

        Prototype clone = prototype.clone();
        // clone 对象改了 key 为什么 prototype 对象的 key 没有变化？因为String被定义成不可变的
        clone.key ="222";
        // clone 对象改了 inner.name，prototype 对象的 inner.name 也发生了变更
        clone.inner.name = "bbb";

        System.out.println("-----clone对象修改了key 和 inner.name-------");


        System.out.println("再打印prototype对象：");
        prototype.print();
    }
}
