package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.factory_method.impl.JsonConfigParser;
import pri.hongweihao.factory.simple_factory.IConfigParser;

public class JsonParserFactory implements IParserFactory {

    @Override
    public IConfigParser createParser() {
        return new JsonConfigParser();
    }
}
