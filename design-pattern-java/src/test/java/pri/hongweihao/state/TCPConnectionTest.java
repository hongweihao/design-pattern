package pri.hongweihao.state;

import org.junit.Test;
import pri.hongweihao.state.tcp.TCPConnection;

/**
 * <p>
 * TCPConnectionTest
 * </p>
 *
 * @author Karl
 * @date 2022/6/7 15:42
 */
public class TCPConnectionTest {
    @Test
    public void test() {
        TCPConnection tcpConnection = new TCPConnection();

        tcpConnection.open();
        tcpConnection.showState();

        tcpConnection.ack();
        tcpConnection.showState();

        tcpConnection.open();
        tcpConnection.ack();
    }
}
