package pri.hongweihao.factory.factory_method.product;


public class JsonConfigParser implements IConfigParser {
    @Override
    public Config parse(String content) {
        System.out.println("解析 Json 格式的内容");
        return null;
    }
}
