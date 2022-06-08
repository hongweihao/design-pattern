package pri.hongweihao.state.meeting;

/**
 * <p>
 * 会议进行中
 * </p>
 *
 * @author Karl
 * @date 2022/6/8 9:49
 */
public class MeetingRunning implements MeetingState {
    private final Meeting meeting;

    public MeetingRunning(Meeting meeting) {
        this.meeting = meeting;
    }

    @Override
    public void start() {
        System.out.println("会议正在进行中，无法开始");

    }

    @Override
    public void end() {
        System.out.println("结束会议成功");
        meeting.setState(new MeetingFinished());
    }
}
