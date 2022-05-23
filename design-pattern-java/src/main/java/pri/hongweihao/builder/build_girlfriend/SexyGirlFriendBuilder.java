package pri.hongweihao.builder.build_girlfriend;

/**
 * <p>
 * 性感女朋友建造者
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:32
 */
public class SexyGirlFriendBuilder implements IGirlFriendBuilder {
    // 发型
    private String hair;
    // 穿着
    private String dress;
    // 性格
    private String character;

    @Override
    public IGirlFriendBuilder buildHair() {
        this.hair = "金色的长发";
        return this;
    }

    @Override
    public IGirlFriendBuilder buildDress() {
        this.dress = "性感睡衣";
        return this;
    }

    @Override
    public IGirlFriendBuilder buildCharacter() {
        this.character = "有点腹黑";
        return this;
    }

    @Override
    public GirlFriend getResult() {
        return new GirlFriend(this.hair, this.dress, this.character);
    }
}
