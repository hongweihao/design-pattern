package pri.hongweihao.ch10.ch10_03.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author Karl
 * @date 2022/3/24 11:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserGetClientRequest extends AbstractUserClientRequest {
    private String userId;
}
