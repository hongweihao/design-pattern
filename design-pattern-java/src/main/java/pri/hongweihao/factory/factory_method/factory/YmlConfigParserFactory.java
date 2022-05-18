package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.factory_method.product.*;

public class YmlConfigParserFactory implements IConfigParserFactory {

    @Override
    public IConfigParser createParser() {
        return new YmlConfigParser();
    }
}
