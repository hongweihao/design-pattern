package pri.hongweihao.replace_inheritance_with_composition.ch10_03.request;

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
public class UserCreateClientRequest extends AbstractUserClientRequest {
    private String userName;
    private String other;
}
