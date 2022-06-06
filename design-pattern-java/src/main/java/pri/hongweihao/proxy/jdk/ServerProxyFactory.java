package pri.hongweihao.proxy.jdk;

import java.lang.reflect.Proxy;

public class ServerProxyFactory {
    private final IServer target;

    public ServerProxyFactory(IServer target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("JDK代理开始");
            Object result = method.invoke(target, args);
            System.out.println("JDK代理结束");
            return result;
        });
    }
}
