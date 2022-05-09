package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.factory_method.impl.JsonParser;
import pri.hongweihao.factory.factory_method.impl.YmlParser;
import pri.hongweihao.factory.simple_factory.IParser;

public class YmlParserFactory implements IParserFactory {

    @Override
    public IParser createParser() {
        return new YmlParser();
    }
}
