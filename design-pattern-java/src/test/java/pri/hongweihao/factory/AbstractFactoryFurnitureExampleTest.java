package pri.hongweihao.factory;

import org.junit.Test;
import pri.hongweihao.factory.abstract_factory.furniture.ChineseFurnitureFactory;
import pri.hongweihao.factory.abstract_factory.furniture.EuropeanFurnitureFactory;
import pri.hongweihao.factory.abstract_factory.furniture.IFurnitureFactory;
import pri.hongweihao.factory.abstract_factory.furniture.MediterraneanFurnitureFactory;

/**
 * <p>
 * 买家具示例 测试类
 * </p>
 *
 * @author Karl
 * @date 2022/5/14 8:17
 */
public class AbstractFactoryFurnitureExampleTest {
    @Test
    public void test() {
        IFurnitureFactory factory;

        // 中国风的家具
        factory = new ChineseFurnitureFactory();
        factory.createChair().print();
        factory.createDesk().print();
        factory.createSofa().print();

        // 欧美风的家具
        factory = new EuropeanFurnitureFactory();
        factory.createChair().print();
        factory.createDesk().print();
        factory.createSofa().print();

        // 地中海风的家具
        factory = new MediterraneanFurnitureFactory();
        factory.createChair().print();
        factory.createDesk().print();
        factory.createSofa().print();
    }
}
