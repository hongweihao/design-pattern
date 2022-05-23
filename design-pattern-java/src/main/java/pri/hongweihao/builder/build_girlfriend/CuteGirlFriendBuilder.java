package pri.hongweihao.builder.build_girlfriend;

/**
 * <p>
 * 可爱女朋友建造者
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:32
 */
public class CuteGirlFriendBuilder implements IGirlFriendBuilder {
    // 发型
    private String hair;
    // 穿着
    private String dress;
    // 性格
    private String character;

    @Override
    public IGirlFriendBuilder buildHair() {
        this.hair = "乌黑靓丽的长发";
        return this;
    }

    @Override
    public IGirlFriendBuilder buildDress() {
        this.dress = "广袖流仙裙";
        return this;
    }

    @Override
    public IGirlFriendBuilder buildCharacter() {
        this.character = "开朗活泼";
        return this;
    }

    @Override
    public GirlFriend getResult() {
        return new GirlFriend(this.hair, this.dress, this.character);
    }
}
