package pri.hongweihao.builder.meet;

import pri.hongweihao.builder.meet.product.AbstractData;
import pri.hongweihao.builder.meet.product.Payload;

/**
 * <p>
 * 建造者接口
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 18:31
 */
public interface IPayloadBuilder<T extends AbstractData> {
    IPayloadBuilder buildEvent();
    IPayloadBuilder buildData();
    Payload<T> build();
}
