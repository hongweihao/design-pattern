package pri.hongweihao.state.meeting;

/**
 * <p>
 * 会议对象，维护会议状态的上下文对象
 * </p>
 *
 * @author Karl
 * @date 2022/6/8 9:48
 */
public class Meeting {
    private MeetingState state;

    public Meeting() {
        this.state = new MeetingCreated(this);
    }

    public void setState(MeetingState state) {
        this.state = state;
    }

    public void start() {
        state.start();
    }

    public void end() {
        state.end();
    }
}
