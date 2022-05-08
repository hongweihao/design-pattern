package pri.hongweihao.factory.simple_factory;

public class ParserFactory {
    IParser createParser(String parseType) {
        if (parseType.equals("json")) return new JsonParser();
        if (parseType.equals("yml")) return new YmlParser();
        if (parseType.equals("xml")) return new XmlParser();
        if (parseType.equals("properties")) return new PropertiesParser();
        return null;
    }
}
