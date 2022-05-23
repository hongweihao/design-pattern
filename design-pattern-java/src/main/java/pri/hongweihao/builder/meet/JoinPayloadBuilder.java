package pri.hongweihao.builder.meet;

import pri.hongweihao.builder.meet.product.Payload;

/**
 * <p>
 * 可爱女朋友建造者
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:32
 */
public class JoinPayloadBuilder implements IPayloadBuilder {
    // 发型
    private String hair;
    // 穿着
    private String dress;
    // 性格
    private String character;

    @Override
    public IPayloadBuilder buildHair() {
        this.hair = "乌黑靓丽的长发";
        return this;
    }

    @Override
    public IPayloadBuilder buildDress() {
        this.dress = "广袖流仙裙";
        return this;
    }

    @Override
    public IPayloadBuilder buildCharacter() {
        this.character = "开朗活泼";
        return this;
    }

    @Override
    public Payload build() {
//        return new Payload(this.hair, this.dress, 0L);
        return null;
    }
}
