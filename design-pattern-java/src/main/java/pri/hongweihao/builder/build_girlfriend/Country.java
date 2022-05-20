package pri.hongweihao.builder.build_girlfriend;

/**
 * <p>
 * 国家发对象了
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:36
 */
public class Country {
    public GirlFriend construct(IGirlFriendBuilder builder) {
        return builder
                .buildHair()
                .buildDress()
                .buildCharacter()
                .build();
    }
}
