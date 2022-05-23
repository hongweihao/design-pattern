package pri.hongweihao.builder.meeting;

import pri.hongweihao.builder.meeting.product.EndData;
import pri.hongweihao.builder.meeting.product.Payload;

import java.time.LocalDateTime;

/**
 * <p>
 * 结束会议
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:32
 */
public class EndPayloadBuilder implements IPayloadBuilder<EndData> {
    // 事件类型
    private String event;
    // 事件数据
    private EndData data;

    @Override
    public IPayloadBuilder<EndData> buildEvent() {
        this.event = "END";
        return this;
    }

    @Override
    public IPayloadBuilder<EndData> buildData(String triggerId, LocalDateTime triggerTime) {
        this.data = new EndData(triggerId);
        return this;
    }

    @Override
    public Payload<EndData> getResult() {
        return new Payload<>(this.event, this.data);
    }
}
