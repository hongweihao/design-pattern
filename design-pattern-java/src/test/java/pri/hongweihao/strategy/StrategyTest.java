package pri.hongweihao.strategy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * <p>
 * 策略模式测试类
 * </p>
 *
 * @author Karl
 * @date 2022/5/30 9:58
 */
public class StrategyTest {
    @Test
    public void test() {
        // 不能包含通配符
        ContainsMatchStrategy containsMatchStrategy = new ContainsMatchStrategy(Arrays.asList("#", "+"));
        // 各项目和应该只能操作对应父path下面的
        PrefixMatchStrategy prefixMatchStrategy = new PrefixMatchStrategy(Collections.singletonList("/t/project1/app1/"));

        MatchContext matchContext = new MatchContext();

        System.out.print("空匹配：");
        System.out.println(matchContext.match(null, null));

        System.out.print("包含匹配，/t/#：");
        System.out.println(matchContext.match("/t/#", containsMatchStrategy));
        System.out.print("包含匹配，/t/+：");
        System.out.println(matchContext.match("/t/+", containsMatchStrategy));
        System.out.print("包含匹配，/t/test：");
        System.out.println(matchContext.match("/t/test", containsMatchStrategy));

        System.out.print("前缀匹配，/t/project1/app2/test：");
        System.out.println(matchContext.match("/t/project1/app2/test", prefixMatchStrategy));
        System.out.print("前缀匹配，/t/project1/app1/test：");
        System.out.println(matchContext.match("/t/project1/app1/test", prefixMatchStrategy));
    }
}
