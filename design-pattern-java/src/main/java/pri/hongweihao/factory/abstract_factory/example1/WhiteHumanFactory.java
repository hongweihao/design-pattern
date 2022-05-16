package pri.hongweihao.factory.abstract_factory.example1;

import pri.hongweihao.factory.abstract_factory.example1.product.Man;
import pri.hongweihao.factory.abstract_factory.example1.product.WhiteMan;
import pri.hongweihao.factory.abstract_factory.example1.product.WhiteWoman;
import pri.hongweihao.factory.abstract_factory.example1.product.Woman;

/**
 * <p>
 * 白人工厂
 * </p>
 *
 * @author Karl
 * @date 2022/5/13 11:36
 */
public class WhiteHumanFactory implements IHumanFactory{
    @Override
    public Man createMan() {
        return new WhiteMan();
    }

    @Override
    public Woman createWoman() {
        return new WhiteWoman();
    }
}
