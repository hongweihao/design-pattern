package pri.hongweihao.factory.abstract_factory.create_human_by_nvwa;

import pri.hongweihao.factory.abstract_factory.create_human_by_nvwa.product.Man;
import pri.hongweihao.factory.abstract_factory.create_human_by_nvwa.product.WhiteMan;
import pri.hongweihao.factory.abstract_factory.create_human_by_nvwa.product.WhiteWoman;
import pri.hongweihao.factory.abstract_factory.create_human_by_nvwa.product.Woman;

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
