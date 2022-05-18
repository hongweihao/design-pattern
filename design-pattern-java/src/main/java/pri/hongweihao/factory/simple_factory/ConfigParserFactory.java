package pri.hongweihao.factory.simple_factory;

import pri.hongweihao.factory.simple_factory.product.*;

public class ConfigParserFactory {
    public IConfigParser createParser(String parseType) {
        if (parseType.equals("json")) return new JsonConfigParser();
        if (parseType.equals("yml")) return new YmlConfigParser();
        if (parseType.equals("xml")) return new XmlConfigParser();
        if (parseType.equals("properties")) return new PropertiesConfigParser();
        return null;
    }
}
