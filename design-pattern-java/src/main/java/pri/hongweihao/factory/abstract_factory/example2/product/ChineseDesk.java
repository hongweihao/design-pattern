package pri.hongweihao.factory.abstract_factory.example2.product;

/**
 * <p>
 * 中国风椅子
 * </p>
 *
 * @author Karl
 * @date 2022/5/16 9:49
 */
public class ChineseDesk extends Desk {
    public ChineseDesk(){
        super();
        this.name = "desk";
        this.style = "Chinese";
    }
}
