package pri.hongweihao.factory.simple_factory;

import org.junit.Test;

public class SimpleFactoryTest {
    @Test
    public void test() {
        ParserFactory parserFactory = new ParserFactory();
        parserFactory.createParser("json").parse("");
        parserFactory.createParser("yml").parse("");
        parserFactory.createParser("xml").parse("");
        parserFactory.createParser("properties").parse("");
    }
}
