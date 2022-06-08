package pri.hongweihao.state.meeting;

/**
 * <p>
 * 会议已经创建
 * </p>
 *
 * @author Karl
 * @date 2022/6/8 9:49
 */
public class MeetingCreated implements MeetingState {
    private final Meeting meeting;

    public MeetingCreated(Meeting meeting) {
        this.meeting = meeting;
    }

    @Override
    public void start() {
        System.out.println("开始会议成功");
        meeting.setState(new MeetingRunning(meeting));
    }

    @Override
    public void end() {
        System.out.println("会议还未开始，无法结束");
    }
}
