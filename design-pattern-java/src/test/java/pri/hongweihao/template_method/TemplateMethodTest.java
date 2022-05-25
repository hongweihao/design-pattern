package pri.hongweihao.template_method;

import org.junit.Test;

/**
 * <p>
 * 模板方法测试类
 * </p>
 *
 * @author Karl
 * @date 2022/5/25 18:13
 */
public class TemplateMethodTest {
    @Test
    public void test() {
        AbstractExpressTemplate express = new OrdinaryExpress();
        express.express();

        System.out.println("----------");

        express = new SuperExpress();
        express.express();
    }
}
