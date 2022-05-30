package pri.hongweihao.strategy;

import java.util.List;

/**
 * <p>
 * 包含匹配
 * </p>
 *
 * @author Karl
 * @date 2022/5/30 9:33
 */
public class ContainsMatchStrategy implements IMatchStrategy {
    private final List<String> containsList;

    public ContainsMatchStrategy(List<String> containsList) {
        this.containsList = containsList;
    }

    @Override
    public boolean match(String topic) {
        for (String exclude : containsList) {
            if (topic.contains(exclude)) {
                return false;
            }
        }
        return true;
    }
}
