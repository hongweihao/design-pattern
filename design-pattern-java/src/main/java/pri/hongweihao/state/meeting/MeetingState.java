package pri.hongweihao.state.meeting;

/**
 * <p>
 * 会议状态接口
 * </p>
 *
 * @author Karl
 * @date 2022/6/8 9:48
 */
public interface MeetingState {
    // 开始会议
    void start();

    // 结束会议
    void end();
}
