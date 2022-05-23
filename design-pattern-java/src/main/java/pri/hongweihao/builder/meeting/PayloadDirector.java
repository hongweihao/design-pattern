package pri.hongweihao.builder.meeting;

import java.time.LocalDateTime;

/**
 * <p>
 * Payload生成指挥者
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:36
 */
public class PayloadDirector {
    public void construct(IPayloadBuilder<?> builder, String triggerId, LocalDateTime triggerTime) {
        builder.buildEvent();
        builder.buildData(triggerId, triggerTime);
    }
}
