package pri.hongweihao.factory.abstract_factory.furniture;

import pri.hongweihao.factory.abstract_factory.furniture.product.Chair;

/**
 * <p>
 * 家具抽象工厂
 * </p>
 *
 * @author Karl
 * @date 2022/5/16 9:26
 */
public interface IChairFactory {
    Chair createChair();
}
