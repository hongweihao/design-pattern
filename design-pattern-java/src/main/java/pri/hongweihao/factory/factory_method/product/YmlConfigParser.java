package pri.hongweihao.factory.factory_method.product;



public class YmlConfigParser implements IConfigParser {
    @Override
    public Config parse(String content) {
        System.out.println("解析 yml 格式的内容");
        return null;
    }
}
