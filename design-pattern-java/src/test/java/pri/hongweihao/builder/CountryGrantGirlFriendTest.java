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
public class CountryGrantGirlFriendTest {
    @Test
    public void test(){
        Country country = new Country();

        // 刚开始你喜欢可爱性的
        GirlFriend cuteGirl = country.construct(new CuteGirlFriendBuilder());
        cuteGirl.print();

        // 后来你觉得可爱在性感面前一文不值
        GirlFriend sexyGirl = country.construct(new SexyGirlFriendBuilder());
        sexyGirl.print();
    }
}
