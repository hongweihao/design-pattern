package pri.hongweihao.proxy;

import org.junit.Test;
import pri.hongweihao.proxy.jdk.IServer;
import pri.hongweihao.proxy.jdk.RemoteServer;
import pri.hongweihao.proxy.jdk.ServerProxyFactory;

public class JDKProxyTest {
    @Test
    public void test() {
        IServer remoteServer = new RemoteServer();
        ServerProxyFactory serverProxyFactory = new ServerProxyFactory(remoteServer);
        IServer proxyInstance = (IServer) serverProxyFactory.getProxyInstance();
        proxyInstance.request(null);
    }
}
