package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.factory_method.impl.JsonParser;
import pri.hongweihao.factory.factory_method.impl.PropertiesParser;
import pri.hongweihao.factory.simple_factory.IParser;

public class PropertiesParserFactory implements IParserFactory {

    @Override
    public IParser createParser() {
        return new PropertiesParser();
    }
}
