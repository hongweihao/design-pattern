package pri.hongweihao;

import org.junit.Test;
import pri.hongweihao.ch02.ch02_1_single_resposibility_principle.*;
import pri.hongweihao.ch02.ch02_1_single_resposibility_principle.bad.VideoUserService;

/**
 * <p>
 * SRP 单一职责 测试类
 * </p>
 *
 * @author Karl
 * @date 2022/4/14 13:56
 */
public class SRPTest {
    @Test
    public void bad() throws Exception {
        VideoUserService service = new VideoUserService();
        service.handle("VIP");
        service.handle("USER");
        service.handle("GUEST");
    }
    @Test
    public void good() {
        IVideoUserService vipVideoUserService = new VipVideoUserService();
        System.out.println("VIP用户。" + vipVideoUserService.definition() + vipVideoUserService.advertise());

        IVideoUserService userVideoUserService = new UserVideoUserService();
        System.out.println("普通用户。" + userVideoUserService.definition() + userVideoUserService.advertise());

        IVideoUserService guestVideoUserService = new GuestVideoUserService();
        System.out.println("游客用户。" + guestVideoUserService.definition() + guestVideoUserService.advertise());
    }
}
