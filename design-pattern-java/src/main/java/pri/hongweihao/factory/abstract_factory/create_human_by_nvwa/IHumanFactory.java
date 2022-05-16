package pri.hongweihao.factory.abstract_factory.create_human_by_nvwa;

import pri.hongweihao.factory.abstract_factory.create_human_by_nvwa.product.Man;
import pri.hongweihao.factory.abstract_factory.create_human_by_nvwa.product.Woman;

/**
 * <p>
 * 女娲造人工厂
 * 以肤色为产品族分类，此外也可以根据性别进行产品族分类
 * </p>
 *
 * @author Karl
 * @date 2022/5/13 11:29
 */
public interface IHumanFactory {
    Man createMan();
    Woman createWoman();
}
