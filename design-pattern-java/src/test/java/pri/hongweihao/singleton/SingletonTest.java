package pri.hongweihao.singleton;

import org.junit.Test;

import java.util.stream.IntStream;

/**
 * <p>
 * 单例测试类
 * 1.饿汉式
 * 2.懒汉式
 * 3.懒汉式双重锁
 * 4.静态内部类
 * 5.枚举
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 14:49
 */
public class SingletonTest {
    @Test
    public void test1() throws InterruptedException  {
        IntStream.range(0, 10).forEach(i -> {
            new Thread(() -> {
                Singleton1 instance = Singleton1.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        });

        Thread.sleep(500);
    }

    @Test
    public void test2() throws InterruptedException  {
        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
            Singleton2 instance = Singleton2.getInstance();
            System.out.println(instance.hashCode());
        }).start());

        Thread.sleep(500);
    }

    @Test
    public void test3() throws InterruptedException {
        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
            Singleton3 instance = Singleton3.getInstance();
            System.out.println(i + ": " + instance.hashCode());
        }).start());

        Thread.sleep(500);
    }

    @Test
    public void test4() throws InterruptedException {
        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
            Singleton4 instance = Singleton4.getInstance();
            System.out.println(i + ": " + instance.hashCode());
        }).start());

        Thread.sleep(500);
    }

    @Test
    public void test5() throws InterruptedException {
        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
            Singleton5 instance = Singleton5.getInstance();

            System.out.println(i + ": " + instance.hashCode());
        }).start());

        Thread.sleep(500);
    }
}
