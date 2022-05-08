package pri.hongweihao.replace_inheritance_with_composition.ch10_03.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class UserUpdateClientResponse extends AbstractUserClientResponse {
}
