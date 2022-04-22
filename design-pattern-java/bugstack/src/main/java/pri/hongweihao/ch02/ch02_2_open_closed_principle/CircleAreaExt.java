package pri.hongweihao.ch02.ch02_2_open_closed_principle;

/**
 * <p>
 * 圆面积扩展类
 * </p>
 *
 * @author Karl
 * @date 2022/4/22 13:24
 */
public class CircleAreaExt extends CircleArea{
    protected final double PI = 3.1415D;

    public CircleAreaExt() {
        super();
    }

    @Override
    public double area(double r) {
        return PI * r * r;
    }
}
