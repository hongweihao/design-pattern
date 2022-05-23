package pri.hongweihao.builder.meeting;

import pri.hongweihao.builder.meeting.product.Payload;
import pri.hongweihao.builder.meeting.product.ShareEndData;

import java.time.LocalDateTime;

/**
 * <p>
 * 加入会议
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:32
 */
public class ShareEndPayloadBuilder implements IPayloadBuilder<ShareEndData> {
    // 事件类型
    private String event;
    // 事件数据
    private ShareEndData data;

    @Override
    public IPayloadBuilder<ShareEndData> buildEvent() {
        this.event = "SHARE_END";
        return this;
    }

    @Override
    public IPayloadBuilder<ShareEndData> buildData(String triggerId, LocalDateTime triggerTime) {
        this.data = new ShareEndData(triggerId, triggerTime);
        return this;
    }

    @Override
    public Payload<ShareEndData> getResult() {
        return new Payload<>(this.event, this.data);
    }
}
