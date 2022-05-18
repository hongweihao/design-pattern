package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.factory_method.product.*;

public class PropertiesConfigParserFactory implements IConfigParserFactory {

    @Override
    public IConfigParser createParser() {
        return new PropertiesConfigParser();
    }
}
