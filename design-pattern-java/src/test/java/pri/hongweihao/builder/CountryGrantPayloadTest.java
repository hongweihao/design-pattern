package pri.hongweihao.builder;

import org.junit.Test;
import pri.hongweihao.builder.build_girlfriend.Country;
import pri.hongweihao.builder.build_girlfriend.CuteGirlFriendBuilder;
import pri.hongweihao.builder.build_girlfriend.GirlFriend;
import pri.hongweihao.builder.build_girlfriend.SexyGirlFriendBuilder;

/**
 * <p>
 * 国家发对象示例测试类
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:41
 */
public class CountryGrantPayloadTest {
    @Test
    public void test() {
        Country country = new Country();

        // 刚开始你喜欢可爱性的
        CuteGirlFriendBuilder cuteGirlFriendBuilder = new CuteGirlFriendBuilder();
        country.construct(cuteGirlFriendBuilder);
        cuteGirlFriendBuilder.getResult().print();

        System.out.println("-----------------");


        // 后来你觉得可爱在性感面前一文不值
        SexyGirlFriendBuilder sexyGirlFriendBuilder = new SexyGirlFriendBuilder();
        country.construct(sexyGirlFriendBuilder);
        sexyGirlFriendBuilder.getResult().print();
    }
}
