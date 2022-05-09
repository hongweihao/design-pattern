package pri.hongweihao.factory;

import org.junit.Test;
import pri.hongweihao.factory.factory_method.factory.*;

public class FactoryMethodTest {
    @Test
    public void test() {
        IParserFactory parserFactory;
        parserFactory = new JsonParserFactory();
        parserFactory.createParser().parse("");

        parserFactory = new YmlParserFactory();
        parserFactory.createParser().parse("");

        parserFactory = new XmlParserFactory();
        parserFactory.createParser().parse("");

        parserFactory = new PropertiesParserFactory();
        parserFactory.createParser().parse("");
    }
}
