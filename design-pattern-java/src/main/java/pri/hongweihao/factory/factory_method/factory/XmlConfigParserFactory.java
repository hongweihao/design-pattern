package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.factory_method.product.IConfigParser;
import pri.hongweihao.factory.factory_method.product.XmlConfigParser;

public class XmlConfigParserFactory implements IConfigParserFactory {

    @Override
    public IConfigParser createParser() {
        return new XmlConfigParser();
    }
}
