package pri.hongweihao.factory.abstract_factory.example2.product;

/**
 * <p>
 * 中国风椅子
 * </p>
 *
 * @author Karl
 * @date 2022/5/16 9:49
 */
public class ChineseChair extends Chair {
    public ChineseChair(){
        super();
        this.name = "chair";
        this.style = "Chinese";
    }
}
