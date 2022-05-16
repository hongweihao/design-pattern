package pri.hongweihao.factory;

import org.junit.Test;
import pri.hongweihao.factory.abstract_factory.example1.BlackHumanFactory;
import pri.hongweihao.factory.abstract_factory.example1.IHumanFactory;
import pri.hongweihao.factory.abstract_factory.example1.WhiteHumanFactory;
import pri.hongweihao.factory.abstract_factory.example1.YellowHumanFactory;

/**
 * <p>
 * 女娲造人示例 测试类
 * </p>
 *
 * @author Karl
 * @date 2022/5/14 8:17
 */
public class AbstractFactoryHumanExampleTest {
    @Test
    public void test() {
        IHumanFactory factory;

        // 黑种人
        factory = new BlackHumanFactory();
        factory.createWoman().showHuman();
        factory.createMan().showHuman();

        // 白种人
        factory = new WhiteHumanFactory();
        factory.createWoman().showHuman();
        factory.createMan().showHuman();

        // 黄种人
        factory = new YellowHumanFactory();
        factory.createWoman().showHuman();
        factory.createMan().showHuman();
    }
}
