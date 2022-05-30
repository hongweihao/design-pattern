package pri.hongweihao.strategy;

import java.util.List;

/**
 * <p>
 * 前缀匹配
 * </p>
 *
 * @author Karl
 * @date 2022/5/30 9:34
 */
public class PrefixMatchStrategy implements IMatchStrategy {
    private final List<String> prefixList;

    public PrefixMatchStrategy(List<String> prefixList) {
        this.prefixList = prefixList;
    }

    @Override
    public boolean match(String topic) {
        for (String prefix : prefixList) {
            if (!topic.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }
}
