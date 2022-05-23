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
    public void construct(IGirlFriendBuilder builder) {
        builder.buildHair()
                .buildDress()
                .buildCharacter();
    }
}
