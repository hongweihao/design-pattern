package pri.hongweihao.template_method;

/**
 * <p>
 * 寄快递的模板抽象类
 * 寄快递流程
 * 1.发起寄件请求
 * 2.取件
 * 3.付钱
 * 4.运送
 * 5.派送
 * 6.结束
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 17:53
 */
public abstract class AbstractExpressTemplate {
    public void express() {
        sendRequest();
        pickUp();
        pay();
        transport();
        delivery();
    }

    // 发送寄件请求
    public abstract void sendRequest();
    // 取件
    public abstract void pickUp();
    // 支付
    public abstract void pay();
    // 运送
    public abstract void transport();
    // 派送
    public abstract void delivery();
}
