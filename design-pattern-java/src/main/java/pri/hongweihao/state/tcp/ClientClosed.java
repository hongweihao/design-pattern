package pri.hongweihao.state.tcp;

/**
 * <p>
 * CLOSED 状态
 * </p>
 *
 * @author Karl
 * @date 2022/6/7 15:32
 */
public class ClientClosed implements IClientState {
    private final TCPConnection tcpConnection;

    public ClientClosed(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        System.out.println("向服务器端发送 SYN 数据包");
        tcpConnection.setState(new ClientSynSend(tcpConnection));
    }

    @Override
    public void ack() {
        throw new UnsupportedOperationException();
    }
}
