package pri.hongweihao;

import org.junit.Test;
import pri.hongweihao.ch02.ch02_2_open_closed_principle.CircleArea;
import pri.hongweihao.ch02.ch02_2_open_closed_principle.CircleAreaExt;

/**
 * <p>
 * 开闭原则测试类
 * </p>
 *
 * @author Karl
 * @date 2022/4/22 13:26
 */
public class OCPTest {

    @Test
    public void test() {
        CircleArea circleArea = new CircleArea();
        System.out.println(circleArea.area(3));

        circleArea = new CircleAreaExt();
        System.out.println(circleArea.area(3));
    }

}
