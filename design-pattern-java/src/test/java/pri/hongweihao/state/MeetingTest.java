package pri.hongweihao.state;

import org.junit.Test;
import pri.hongweihao.state.meeting.Meeting;

import java.lang.reflect.Method;

/**
 * <p>
 * MeetingTest
 * </p>
 *
 * @author Karl
 * @date 2022/6/8 9:53
 */
public class MeetingTest {
    @Test
    public void test() {
        Meeting meeting = new Meeting();
        meeting.end();
        meeting.start();
        meeting.start();
        meeting.end();
        meeting.end();
        meeting.start();
        meeting.end();
    }
}
