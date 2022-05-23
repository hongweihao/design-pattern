package pri.hongweihao.builder.meeting;

import pri.hongweihao.builder.meeting.product.LeaveData;
import pri.hongweihao.builder.meeting.product.Payload;

import java.time.LocalDateTime;

/**
 * <p>
 * 离开会议
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:32
 */
public class LeavePayloadBuilder implements IPayloadBuilder<LeaveData> {
    // 事件类型
    private String event;
    // 事件数据
    private LeaveData data;

    @Override
    public IPayloadBuilder<LeaveData> buildEvent() {
        this.event = "LEAVE";
        return this;
    }

    @Override
    public IPayloadBuilder<LeaveData> buildData(String triggerId, LocalDateTime triggerTime) {
        this.data = new LeaveData(triggerId);
        return this;
    }

    @Override
    public Payload<LeaveData> getResult() {
        return new Payload<>(this.event, this.data);
    }
}
