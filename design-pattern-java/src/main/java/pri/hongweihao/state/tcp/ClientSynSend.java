package pri.hongweihao.state.tcp;

/**
 * <p>
 * SYN_SEND 状态
 * </p>
 *
 * @author Karl
 * @date 2022/6/7 15:32
 */
public class ClientSynSend implements IClientState {
    private final TCPConnection tcpConnection;

    public ClientSynSend(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        System.out.println("已经发起了连接请求，无需继续建立连接。");
    }

    @Override
    public void ack() {
        System.out.println("接收到来自服务器端的 ACK 确认包和 SYN 数据包");
        System.out.println("向服务器端发送来自服务器的SYN 数据的 ACK 确认包");
        tcpConnection.setState(new ClientEstablished());
    }
}
