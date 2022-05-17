package pri.hongweihao.factory.simple_factory;

import pri.hongweihao.factory.simple_factory.impl.JsonConfigParser;
import pri.hongweihao.factory.simple_factory.impl.PropertiesConfigParser;
import pri.hongweihao.factory.simple_factory.impl.XmlConfigParser;
import pri.hongweihao.factory.simple_factory.impl.YmlConfigParser;

public class ConfigParserFactory {
    public IConfigParser createParser(String parseType) {
        if (parseType.equals("json")) return new JsonConfigParser();
        if (parseType.equals("yml")) return new YmlConfigParser();
        if (parseType.equals("xml")) return new XmlConfigParser();
        if (parseType.equals("properties")) return new PropertiesConfigParser();
        return null;
    }
}
