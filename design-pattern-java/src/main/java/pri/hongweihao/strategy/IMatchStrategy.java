package pri.hongweihao.strategy;

/**
 * <p>
 * topic 匹配器
 * 1.topic 不包含通配符
 * 2.各个app统一前缀
 * </p>
 *
 * @author Karl
 * @date 2022/5/30 9:30
 */
public interface IMatchStrategy {
    boolean match(String topic);
}
