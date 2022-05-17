package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.factory_method.impl.PropertiesConfigParser;
import pri.hongweihao.factory.simple_factory.IConfigParser;

public class PropertiesParserFactory implements IParserFactory {

    @Override
    public IConfigParser createParser() {
        return new PropertiesConfigParser();
    }
}
