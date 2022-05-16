package pri.hongweihao.factory.abstract_factory.furniture;

import pri.hongweihao.factory.abstract_factory.furniture.product.Chair;
import pri.hongweihao.factory.abstract_factory.furniture.product.Desk;
import pri.hongweihao.factory.abstract_factory.furniture.product.Sofa;

/**
 * <p>
 * 家具抽象工厂
 * </p>
 *
 * @author Karl
 * @date 2022/5/16 9:26
 */
public interface IFurnitureFactory {
    Chair createChair();
    Desk createDesk();
    Sofa createSofa();
}
