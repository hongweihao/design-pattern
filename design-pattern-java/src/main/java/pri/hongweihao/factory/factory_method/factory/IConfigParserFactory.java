package pri.hongweihao.factory.factory_method.factory;


import pri.hongweihao.factory.factory_method.product.IConfigParser;

public interface IConfigParserFactory {
    IConfigParser createParser();
}
