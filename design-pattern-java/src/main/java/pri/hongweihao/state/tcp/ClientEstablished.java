package pri.hongweihao.state.tcp;

/**
 * <p>
 * ESTABLISHED 状态
 * </p>
 *
 * @author Karl
 * @date 2022/6/7 15:32
 */
public class ClientEstablished implements IClientState {
    @Override
    public void open() {
        System.out.println("连接已建立，无需继续建立连接");
    }

    @Override
    public void ack() {
        System.out.println("连接已建立，丢弃确认包");
    }
}
