package pri.hongweihao.factory;

import org.junit.Test;
import pri.hongweihao.factory.factory_method.factory.*;

public class FactoryMethodTest {
    @Test
    public void test() {
        IConfigParserFactory parserFactory;
        parserFactory = new JsonConfigParserFactory();
        parserFactory.createParser().parse("");

        parserFactory = new YmlConfigParserFactory();
        parserFactory.createParser().parse("");

        parserFactory = new XmlConfigParserFactory();
        parserFactory.createParser().parse("");

        parserFactory = new PropertiesConfigParserFactory();
        parserFactory.createParser().parse("");
    }

    @Test
    public void getFactory(){
        ConfigParserFactory configParserFactory = new ConfigParserFactory();
        configParserFactory.getFactory("json").createParser().parse("");
        configParserFactory.getFactory("yml").createParser().parse("");
        configParserFactory.getFactory("xml").createParser().parse("");
        configParserFactory.getFactory("properties").createParser().parse("");
    }
}
