package pri.hongweihao.state.meeting;

/**
 * <p>
 * 会议已经结束
 * </p>
 *
 * @author Karl
 * @date 2022/6/8 9:49
 */
public class MeetingFinished implements MeetingState {
    @Override
    public void start() {
        System.out.println("会议已经结束，无法开始");
    }

    @Override
    public void end() {
        System.out.println("会议已经结束，无法结束");
    }
}
