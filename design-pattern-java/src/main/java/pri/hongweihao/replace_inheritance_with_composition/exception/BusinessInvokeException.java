package pri.hongweihao.replace_inheritance_with_composition.exception;

/**
 * <p>
 * 业务调用异常
 * </p>
 *
 * @author Karl
 * @date 2022/3/23 10:43
 */
public class BusinessInvokeException extends RuntimeException {
    public BusinessInvokeException(String message) {
        super("error message: " + message);
    }
}
