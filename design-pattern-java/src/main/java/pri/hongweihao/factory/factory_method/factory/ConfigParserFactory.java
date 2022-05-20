package pri.hongweihao.factory.factory_method.factory;

/**
 * <p>
 * 各个产品对应工厂的工厂
 * </p>
 *
 * @author Karl
 * @date 2022/5/18 9:42
 */
public class ConfigParserFactory {
    private final IConfigParserFactory jsonConfigParserFactory;
    private final IConfigParserFactory ymlConfigParserFactory;
    private final IConfigParserFactory xmlConfigParserFactory;
    private final IConfigParserFactory propertiesConfigParserFactory;

    public ConfigParserFactory() {
        this.jsonConfigParserFactory = new JsonConfigParserFactory();
        this.ymlConfigParserFactory = new YmlConfigParserFactory();
        this.xmlConfigParserFactory = new XmlConfigParserFactory();
        this.propertiesConfigParserFactory = new PropertiesConfigParserFactory();
    }

    public IConfigParserFactory getFactory(String type) {
        if (type.equals("json")) return this.jsonConfigParserFactory;
        if (type.equals("yml")) return this.ymlConfigParserFactory;
        if (type.equals("xml")) return this.xmlConfigParserFactory;
        if (type.equals("properties")) return this.propertiesConfigParserFactory;
        return null;
    }
}
