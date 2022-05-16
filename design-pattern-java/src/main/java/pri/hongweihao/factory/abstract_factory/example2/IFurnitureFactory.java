package pri.hongweihao.factory.abstract_factory.example2;

import pri.hongweihao.factory.abstract_factory.example2.product.Chair;
import pri.hongweihao.factory.abstract_factory.example2.product.Desk;
import pri.hongweihao.factory.abstract_factory.example2.product.Sofa;

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
