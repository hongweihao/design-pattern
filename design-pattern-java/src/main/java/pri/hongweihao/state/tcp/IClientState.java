package pri.hongweihao.state.tcp;

/**
 * <p>
 * TCP 客户端状态接口
 * </p>
 *
 * @author Karl
 * @date 2022/6/7 15:31
 */
public interface IClientState {
    void open();

    void ack();
}
