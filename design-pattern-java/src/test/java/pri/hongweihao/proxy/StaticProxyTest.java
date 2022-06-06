package pri.hongweihao.proxy;

import org.junit.Test;
import pri.hongweihao.proxy.static_proxy.LocalNodeServer;
import pri.hongweihao.proxy.static_proxy.RemoteServer;

public class StaticProxyTest {
    @Test
    public void test() {
        RemoteServer remoteServer = new RemoteServer();
        LocalNodeServer localNodeServer = new LocalNodeServer(remoteServer);
        localNodeServer.request(null);
    }
}
