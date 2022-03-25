package pri.hongweihao.ch10.exception;

/**
 * <p>
 * HTTP code 不符合预期异常
 * </p>
 *
 * @author Karl
 * @date 2022/3/23 10:43
 */
public class HttpCodeNotExpectedException extends RuntimeException {
    public HttpCodeNotExpectedException(Integer code) {
        super("Not Expected code: " + code);
    }
}
