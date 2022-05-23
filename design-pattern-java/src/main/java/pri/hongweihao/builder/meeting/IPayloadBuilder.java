package pri.hongweihao.builder.meeting;

import pri.hongweihao.builder.meeting.product.AbstractData;
import pri.hongweihao.builder.meeting.product.Payload;

import java.time.LocalDateTime;

/**
 * <p>
 * 建造者接口
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:31
 */
public interface IPayloadBuilder<T extends AbstractData> {
    IPayloadBuilder<T> buildEvent();
    IPayloadBuilder<T> buildData(String triggerId, LocalDateTime triggerTime);
    Payload<T> getResult();
}
