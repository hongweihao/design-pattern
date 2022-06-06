package pri.hongweihao.proxy.cglib;

import pri.hongweihao.proxy.jdk.IServer;

public class RemoteServer implements IServer {
    @Override
    public void request(String request) {
        System.out.println("向远端服务器发送请求");
    }
}
