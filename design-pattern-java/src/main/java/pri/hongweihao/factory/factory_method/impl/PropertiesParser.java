package pri.hongweihao.factory.factory_method.impl;

import pri.hongweihao.factory.simple_factory.Config;
import pri.hongweihao.factory.simple_factory.IParser;

public class PropertiesParser implements IParser {
    @Override
    public Config parse(String content) {
        System.out.println("解析 Properties 格式的内容");
        return null;
    }
}
