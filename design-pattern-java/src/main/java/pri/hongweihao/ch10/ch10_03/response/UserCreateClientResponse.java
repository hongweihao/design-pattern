package pri.hongweihao.ch10.ch10_03.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pri.hongweihao.ch10.common.HttpResponse;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author Karl
 * @date 2022/3/24 17:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserCreateClientResponse extends AbstractUserClientResponse {
    private String userId;
}