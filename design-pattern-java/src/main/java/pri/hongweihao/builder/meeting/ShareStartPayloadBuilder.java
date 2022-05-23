package pri.hongweihao.builder.meeting;

import pri.hongweihao.builder.meeting.product.ShareStartData;
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
public class ShareStartPayloadBuilder implements IPayloadBuilder<ShareStartData> {
    // 事件类型
    private String event;
    // 事件数据
    private ShareStartData data;

    @Override
    public IPayloadBuilder<ShareStartData> buildEvent() {
        this.event = "SHARE_START";
        return this;
    }

    @Override
    public IPayloadBuilder<ShareStartData> buildData(String triggerId, LocalDateTime triggerTime) {
        this.data = new ShareStartData(triggerId, triggerTime);
        return this;
    }

    @Override
    public Payload<ShareStartData> getResult() {
        return new Payload<>(this.event, this.data);
    }
}
