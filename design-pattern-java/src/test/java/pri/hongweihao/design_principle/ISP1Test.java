package pri.hongweihao.design_principle;

import org.junit.Test;
import pri.hongweihao.desigin_principle.interface_segregation_principle.bad.IToken;
import pri.hongweihao.desigin_principle.interface_segregation_principle.bad.JwtToken;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 接口隔离原则 错误实例测试类
 * </p>
 *
 * @author Karl
 * @date 2022/4/29 20:04
 */
public class ISP1Test {
    @Test
    public void test1() {
        // A 模块
        IToken token = new JwtToken();
        String jwt = token.generate("karl.hong", new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10)));
        System.out.println(jwt);
        // 仅需要生成 token 的 A 模块。被强制依赖了 parse 方法
        token.parse(jwt);
    }

    @Test
    public void test2() {
        // B 模块
        String jwt = getRequestToken();
        IToken token = new JwtToken();
        String userId = token.parse(jwt);
        System.out.println(userId);

        // 仅需要生成 token 的 B 模块。被强制依赖了 generate 方法
        token.generate("xxx", new Date());
    }

    private String getRequestToken() {
        IToken token = new JwtToken();
        return token.generate("karl.hong", new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10)));
    }
}
