package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.factory_method.impl.YmlConfigParser;
import pri.hongweihao.factory.simple_factory.IConfigParser;

public class YmlParserFactory implements IParserFactory {

    @Override
    public IConfigParser createParser() {
        return new YmlConfigParser();
    }
}
