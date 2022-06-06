package pri.hongweihao.proxy.static_proxy;

public class LocalNodeServer implements IServer {
    private final RemoteServer target;

    public LocalNodeServer(RemoteServer target) {
        this.target = target;
    }

    @Override
    public void request(String request) {
        System.out.println("向本地Node服务发送请求开始");
        target.request(request);
        System.out.println("向本地Node服务发送请求结束");
    }
}
