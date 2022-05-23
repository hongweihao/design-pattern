package pri.hongweihao.builder.build_girlfriend;

/**
 * <p>
 * 建造者接口
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:31
 */
public interface IGirlFriendBuilder {
    IGirlFriendBuilder buildHair();
    IGirlFriendBuilder buildDress();
    IGirlFriendBuilder buildCharacter();
    GirlFriend getResult();
}
