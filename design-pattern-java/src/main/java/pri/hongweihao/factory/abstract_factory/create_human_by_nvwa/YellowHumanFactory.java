package pri.hongweihao.factory.abstract_factory.create_human_by_nvwa;

import pri.hongweihao.factory.abstract_factory.create_human_by_nvwa.product.*;

/**
 * <p>
 * 黄人工厂
 * </p>
 *
 * @author Karl
 * @date 2022/5/13 11:36
 */
public class YellowHumanFactory implements IHumanFactory{
    @Override
    public Man createMan() {
        return new YellowMan();
    }

    @Override
    public Woman createWoman() {
        return new YellowWoman();
    }
}
