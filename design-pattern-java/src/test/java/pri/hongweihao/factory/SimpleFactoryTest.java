package pri.hongweihao.factory;

import org.junit.Test;
import pri.hongweihao.factory.simple_factory.ConfigParserFactory;

public class SimpleFactoryTest {
    @Test
    public void test() {
        ConfigParserFactory configParserFactory = new ConfigParserFactory();
        configParserFactory.createParser("json").parse("");
        configParserFactory.createParser("yml").parse("");
        configParserFactory.createParser("xml").parse("");
        configParserFactory.createParser("properties").parse("");
    }
}
