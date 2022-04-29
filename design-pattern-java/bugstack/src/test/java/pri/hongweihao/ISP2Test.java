package pri.hongweihao;

import org.junit.Test;
import pri.hongweihao.ch02.ch02_5_interface_segregation_principle.ITokenGenerator;
import pri.hongweihao.ch02.ch02_5_interface_segregation_principle.ITokenParser;
import pri.hongweihao.ch02.ch02_5_interface_segregation_principle.JwtToken;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 接口隔离原则 正确实例测试类
 * </p>
 *
 * @author Karl
 * @date 2022/4/29 20:04
 */
public class ISP2Test {
    @Test
    public void test1() {
        // A 模块
        ITokenGenerator token = new JwtToken();
        String jwt = token.generate("karl.hong", new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10)));
        System.out.println(jwt);
    }

    @Test
    public void test2() {
        // B 模块
        String jwt = getRequestToken();
        ITokenParser token = new JwtToken();
        String userId = token.parse(jwt);
        System.out.println(userId);
    }

    private String getRequestToken() {
        ITokenGenerator token = new JwtToken();
        return token.generate("karl.hong", new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10)));
    }
}
