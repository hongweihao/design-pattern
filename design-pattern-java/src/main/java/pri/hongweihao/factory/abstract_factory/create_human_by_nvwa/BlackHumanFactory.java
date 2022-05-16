package pri.hongweihao.factory.abstract_factory.create_human_by_nvwa;

import pri.hongweihao.factory.abstract_factory.create_human_by_nvwa.product.*;

/**
 * <p>
 * 黑人工厂
 * </p>
 *
 * @author Karl
 * @date 2022/5/13 11:36
 */
public class BlackHumanFactory implements IHumanFactory{
    @Override
    public Man createMan() {
        return new BlackMan();
    }

    @Override
    public Woman createWoman() {
        return new BlackWoman();
    }
}
