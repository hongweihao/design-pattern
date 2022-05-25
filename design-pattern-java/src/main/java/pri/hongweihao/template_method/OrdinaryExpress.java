package pri.hongweihao.template_method;

/**
 * <p>
 * 普通快递寄件
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 18:06
 */
public class OrdinaryExpress extends AbstractExpressTemplate{
    @Override
    public void sendRequest() {
        System.out.println("寄件处领寄件单填写，填写后交给寄件员");
    }

    @Override
    public void pickUp() {
        System.out.println("把要寄的东西拿到寄件处给寄件员");
    }

    @Override
    public void pay() {
        System.out.println("现金支付");
    }

    @Override
    public void transport() {
        System.out.println("汽车运送");
    }

    @Override
    public void delivery() {
        System.out.println("快件收到取件处，由派送员打电话给收件人来取快件");
    }
}
