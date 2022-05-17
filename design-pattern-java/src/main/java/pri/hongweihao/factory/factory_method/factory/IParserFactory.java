package pri.hongweihao.factory.factory_method.factory;

import pri.hongweihao.factory.simple_factory.IConfigParser;

public interface IParserFactory {
    IConfigParser createParser();
}
