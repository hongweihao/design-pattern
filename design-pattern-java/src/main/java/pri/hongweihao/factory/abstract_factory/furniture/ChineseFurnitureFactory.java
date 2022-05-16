package pri.hongweihao.factory.abstract_factory.furniture;

import pri.hongweihao.factory.abstract_factory.furniture.product.*;

/**
 * <p>
 * 中国风家具工厂
 * </p>
 *
 * @author Karl
 * @date 2022/5/16 9:56
 */
public class ChineseFurnitureFactory implements IFurnitureFactory {
    @Override
    public Chair createChair() {
        return new ChineseChair();
    }

    @Override
    public Desk createDesk() {
        return new ChineseDesk();
    }

    @Override
    public Sofa createSofa() {
        return new ChineseSofa();
    }
}
