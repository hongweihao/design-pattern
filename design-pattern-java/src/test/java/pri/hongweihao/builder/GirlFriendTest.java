package pri.hongweihao.builder;

import org.junit.Test;
import pri.hongweihao.builder.static_inner_class.GirlFriend;

/**
 * <p>
 * 简单的建造者示例测试类
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 16:22
 */
public class GirlFriendTest {
    @Test
    public void test(){
        GirlFriend girl = GirlFriend.builder()
                .hair("乌黑靓丽的长发")
                .dress("广袖流仙裙")
                .character("开朗活泼")
                .build();
        girl.print();
    }

}
