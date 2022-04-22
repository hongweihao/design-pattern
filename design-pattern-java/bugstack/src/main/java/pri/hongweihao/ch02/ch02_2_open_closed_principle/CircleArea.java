package pri.hongweihao.ch02.ch02_2_open_closed_principle;

/**
 * <p>
 * 圆面积
 * </p>
 *
 * @author Karl
 * @date 2022/4/22 13:20
 */
public class CircleArea {
    protected final double PI = 3.14D;

    public CircleArea(){}

    public double area(double r) {
        return PI * r * r;
    }
}
