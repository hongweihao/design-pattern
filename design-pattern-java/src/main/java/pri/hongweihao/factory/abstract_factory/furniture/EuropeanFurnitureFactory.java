package pri.hongweihao.factory.abstract_factory.furniture;

import pri.hongweihao.factory.abstract_factory.furniture.product.*;

/**
 * <p>
 * 欧美风家具工厂
 * </p>
 *
 * @author Karl
 * @date 2022/5/16 9:56
 */
public class EuropeanFurnitureFactory implements IFurnitureFactory {
    @Override
    public Chair createChair() {
        return new EuropeanChair();
    }

    @Override
    public Desk createDesk() {
        return new EuropeanDesk();
    }

    @Override
    public Sofa createSofa() {
        return new EuropeanSofa();
    }
}
