package pri.hongweihao.strategy;

import java.util.Objects;

/**
 * <p>
 * 匹配策略 context
 * </p>
 *
 * @author Karl
 * @date 2022/5/30 9:35
 */
public class MatchContext {
    public boolean match(String topic, IMatchStrategy matchStrategy) {
        if (Objects.isNull(topic) || "".equals(topic)) {
            return false;
        }
        return matchStrategy.match(topic);
    }
}
