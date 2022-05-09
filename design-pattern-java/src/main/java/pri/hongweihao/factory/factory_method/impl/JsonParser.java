package pri.hongweihao.factory.factory_method.impl;

import pri.hongweihao.factory.simple_factory.Config;
import pri.hongweihao.factory.simple_factory.IParser;

public class JsonParser implements IParser {
    @Override
    public Config parse(String content) {
        System.out.println("解析 Json 格式的内容");
        return null;
    }
}
