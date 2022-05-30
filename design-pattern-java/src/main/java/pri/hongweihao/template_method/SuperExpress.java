package pri.hongweihao.template_method;

/**
 * <p>
 * 顶级快递寄件
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 18:04
 */
public class SuperExpress extends AbstractExpressTemplate {
    @Override
    public void sendRequest() {
        System.out.println("App填写寄件单");
    }

    @Override
    public void pickUp() {
        System.out.println("寄件员上门取件");
    }

    @Override
    public void pay() {
        System.out.println("App 在线支付");
    }

    @Override
    public void transport() {
        System.out.println("根据需求选择运送方式，远距离使用空运");
    }

    @Override
    public void delivery() {
        System.out.println("派送员送件上门");
    }
}
