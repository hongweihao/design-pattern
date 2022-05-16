package pri.hongweihao.factory.abstract_factory.example1;

import pri.hongweihao.factory.abstract_factory.example1.product.Human;
import pri.hongweihao.factory.abstract_factory.example1.product.Man;
import pri.hongweihao.factory.abstract_factory.example1.product.Woman;

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
