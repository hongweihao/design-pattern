package pri.hongweihao.factory.simple_factory.impl;

import pri.hongweihao.factory.simple_factory.Config;
import pri.hongweihao.factory.simple_factory.IParser;

public class YmlParser implements IParser {
    @Override
    public Config parse(String content) {
        System.out.println("解析 yml 格式的内容");
        return null;
    }
}
