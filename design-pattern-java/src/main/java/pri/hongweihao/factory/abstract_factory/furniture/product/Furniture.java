package pri.hongweihao.factory.abstract_factory.furniture.product;

/**
 * <p>
 * 家具
 * </p>
 *
 * @author Karl
 * @date 2022/5/16 9:34
 */
public abstract class Furniture {
    // 家具名称，用途
    protected String name;
    // 风格
    protected String style;

    public void print(){
        System.out.println(style + " style " + name);
    }

}
