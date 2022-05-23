package pri.hongweihao.builder;

import org.junit.Test;
import pri.hongweihao.builder.meeting.*;

import java.time.LocalDateTime;

/**
 * <p>
 * 会议长链接推送消息payload构建示例测试类
 * </p>
 *
 * @author Karl
 * @date 2022/5/23 17:16
 */
public class MeetPayloadBuilderTest {
    @Test
    public void test() {
        PayloadDirector payloadDirector = new PayloadDirector();

        JoinPayloadBuilder joinPayloadBuilder = new JoinPayloadBuilder();
        payloadDirector.construct(joinPayloadBuilder, "uid1001", LocalDateTime.now());
        joinPayloadBuilder.getResult().print();

        ShareStartPayloadBuilder shareStartPayloadBuilder = new ShareStartPayloadBuilder();
        payloadDirector.construct(shareStartPayloadBuilder, "uid1001", LocalDateTime.now());
        shareStartPayloadBuilder.getResult().print();

        ShareEndPayloadBuilder shareEndPayloadBuilder = new ShareEndPayloadBuilder();
        payloadDirector.construct(shareEndPayloadBuilder, "uid1001", LocalDateTime.now());
        shareEndPayloadBuilder.getResult().print();

        LeavePayloadBuilder leavePayloadBuilder = new LeavePayloadBuilder();
        payloadDirector.construct(leavePayloadBuilder, "uid1002", LocalDateTime.now());
        leavePayloadBuilder.getResult().print();

        EndPayloadBuilder endPayloadBuilder = new EndPayloadBuilder();
        payloadDirector.construct(endPayloadBuilder, "uid1003", LocalDateTime.now());
        endPayloadBuilder.getResult().print();
    }
}
