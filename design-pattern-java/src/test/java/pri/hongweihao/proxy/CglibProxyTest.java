package pri.hongweihao.proxy;

import org.junit.Test;
import pri.hongweihao.proxy.cglib.RemoteServer;
import pri.hongweihao.proxy.cglib.ServerProxyFactory;

public class CglibProxyTest {
    @Test
    public void test() {
        RemoteServer remoteServer = new RemoteServer();
        RemoteServer proxyInstance = (RemoteServer) new ServerProxyFactory(remoteServer).getProxyInstance();
        proxyInstance.request(null);
    }
}
