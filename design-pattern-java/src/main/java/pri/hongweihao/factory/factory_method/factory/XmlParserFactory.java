package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.factory_method.impl.XmlConfigParser;
import pri.hongweihao.factory.simple_factory.IConfigParser;

public class XmlParserFactory implements IParserFactory {

    @Override
    public IConfigParser createParser() {
        return new XmlConfigParser();
    }
}
