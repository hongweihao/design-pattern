package pri.hongweihao.builder.meeting;

import pri.hongweihao.builder.meeting.product.JoinData;
import pri.hongweihao.builder.meeting.product.Payload;

import java.time.LocalDateTime;

/**
 * <p>
 * 加入会议
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:32
 */
public class JoinPayloadBuilder implements IPayloadBuilder<JoinData> {
    // 事件类型
    private String event;
    // 事件数据
    private JoinData data;

    @Override
    public IPayloadBuilder<JoinData> buildEvent() {
        this.event = "JOIN";
        return this;
    }

    @Override
    public IPayloadBuilder<JoinData> buildData(String triggerId, LocalDateTime triggerTime) {
        this.data = new JoinData(triggerId);
        return this;
    }

    @Override
    public Payload<JoinData> getResult() {
        return new Payload<>(this.event, this.data);
    }
}
