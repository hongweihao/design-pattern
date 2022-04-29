package pri.hongweihao;

import org.junit.Test;
import pri.hongweihao.ch02.ch02_6_dependency_inversion_principle.UserInfo;
import pri.hongweihao.ch02.ch02_6_dependency_inversion_principle.bad.DrawService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DIP1Test {
    @Test
    public void test() {

        List<UserInfo> userInfos = Arrays.asList(
                new UserInfo("大白", 4),
                new UserInfo("小黑", 8),
                new UserInfo("周扒皮", 5),
                new UserInfo("钢铁人", 2)
        );

        DrawService service = new DrawService();
        List<UserInfo> luckUserList1 = service.drawRandom(userInfos, 2);
        System.out.println(luckUserList1.stream().map(UserInfo::getUserId).collect(Collectors.joining(",")));

        List<UserInfo> luckUserList2 = service.drawWeight(userInfos, 2);
        System.out.println(luckUserList2.stream().map(UserInfo::getUserId).collect(Collectors.joining(",")));

    }
}
