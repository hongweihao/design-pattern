package pri.hongweihao.factory.simple_factory.product;

public class YmlConfigParser implements IConfigParser {
    @Override
    public Config parse(String content) {
        System.out.println("解析 yml 格式的内容");
        return null;
    }
}
