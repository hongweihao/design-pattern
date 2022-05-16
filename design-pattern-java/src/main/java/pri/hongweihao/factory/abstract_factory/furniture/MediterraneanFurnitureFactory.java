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
public class MediterraneanFurnitureFactory implements IFurnitureFactory {
    @Override
    public Chair createChair() {
        return new MediterraneanChair();
    }

    @Override
    public Desk createDesk() {
        return new MediterraneanDesk();
    }

    @Override
    public Sofa createSofa() {
        return new MediterraneanSofa();
    }
}
