package pri.hongweihao.builder.meet;

import pri.hongweihao.builder.meet.product.Payload;

/**
 * <p>
 * 国家发对象了
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:36
 */
public class Country {
    public Payload construct(IPayloadBuilder builder) {
        return builder
                .buildHair()
                .buildDress()
                .buildCharacter()
                .build();
    }
}
