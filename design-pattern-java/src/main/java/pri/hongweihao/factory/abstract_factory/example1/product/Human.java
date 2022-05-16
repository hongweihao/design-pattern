package pri.hongweihao.factory.abstract_factory.example1.product;

/**
 * <p>
 * 人
 * </p>
 *
 * @author Karl
 * @date 2022/5/13 11:28
 */
public abstract class Human {
    // 肤色
    protected String color;
    // 性别
    protected String gender;

    public void showHuman() {
        System.out.println("color: " + color + " gender: " + gender);
    }
}
