package pri.hongweihao.factory.simple_factory;

import pri.hongweihao.factory.simple_factory.impl.JsonParser;
import pri.hongweihao.factory.simple_factory.impl.PropertiesParser;
import pri.hongweihao.factory.simple_factory.impl.XmlParser;
import pri.hongweihao.factory.simple_factory.impl.YmlParser;

public class ParserFactory {
    public IParser createParser(String parseType) {
        if (parseType.equals("json")) return new JsonParser();
        if (parseType.equals("yml")) return new YmlParser();
        if (parseType.equals("xml")) return new XmlParser();
        if (parseType.equals("properties")) return new PropertiesParser();
        return null;
    }
}
