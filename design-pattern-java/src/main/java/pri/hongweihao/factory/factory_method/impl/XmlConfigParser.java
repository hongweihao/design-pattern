package pri.hongweihao.factory.factory_method.impl;

import pri.hongweihao.factory.simple_factory.Config;
import pri.hongweihao.factory.simple_factory.IConfigParser;

public class XmlConfigParser implements IConfigParser {
    @Override
    public Config parse(String content) {
        System.out.println("解析 XMl 格式的内容");
        return null;
    }
}
