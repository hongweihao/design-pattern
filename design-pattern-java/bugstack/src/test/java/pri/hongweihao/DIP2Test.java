package pri.hongweihao;

import org.junit.Test;
import pri.hongweihao.ch02.ch02_6_dependency_inversion_principle.IDraw;
import pri.hongweihao.ch02.ch02_6_dependency_inversion_principle.RandomDraw;
import pri.hongweihao.ch02.ch02_6_dependency_inversion_principle.UserInfo;
import pri.hongweihao.ch02.ch02_6_dependency_inversion_principle.WeightDraw;
import pri.hongweihao.ch02.ch02_6_dependency_inversion_principle.DrawService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DIP2Test {
    @Test
    public void test() {

        List<UserInfo> userInfos = Arrays.asList(
                new UserInfo("大白", 4),
                new UserInfo("小黑", 8),
                new UserInfo("周扒皮", 5),
                new UserInfo("钢铁人", 2)
        );

        DrawService service = new DrawService();
        IDraw randomDraw = new RandomDraw();
        IDraw weightDraw = new WeightDraw();

        List<UserInfo> luckUserList1 = service.draw(randomDraw,userInfos, 2);
        System.out.println(luckUserList1.stream().map(UserInfo::getUserId).collect(Collectors.joining(",")));

        List<UserInfo> luckUserList2 = service.draw(weightDraw, userInfos, 2);
        System.out.println(luckUserList2.stream().map(UserInfo::getUserId).collect(Collectors.joining(",")));
    }
}
