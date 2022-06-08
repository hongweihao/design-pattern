package pri.hongweihao.state.tcp;

/**
 * <p>
 * TCP连接对象，相当于 Context 上下文对象
 * </p>
 *
 * @author Karl
 * @date 2022/6/7 15:33
 */
public class TCPConnection {
    private IClientState state;

    public TCPConnection() {
        this.state = new ClientClosed(this);
    }

    public TCPConnection(IClientState state) {
        this.state = state;
    }

    public void open() {
        state.open();
    }

    public void ack() {
        state.ack();
        state = new ClientEstablished();
    }

    public void setState(IClientState state) {
        this.state = state;
    }

    public void showState() {
        System.out.println(this.state);
    }
}
