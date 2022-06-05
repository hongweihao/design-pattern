package pri.hongweihao.chain_of_responsibility;

import org.junit.Test;
import pri.hongweihao.chain_of_responsibility.list_chain.*;

import java.util.HashMap;

public class ListMeetQueryCheckerChainTest {
    @Test
    public void test() {
        IMeetQueryChecker tokenChecker = new TokenChecker();
        IMeetQueryChecker userChecker = new UserChecker();
        IMeetQueryChecker meetChecker = new MeetChecker();
        IMeetQueryChecker meetJoinerChecker = new MeetJoinerChecker();

        ListMeetQueryCheckerChain chain = new ListMeetQueryCheckerChain();
        chain.addChecker(tokenChecker);
        chain.addChecker(userChecker);
        chain.addChecker(meetChecker);
        chain.addChecker(meetJoinerChecker);

        chain.check(null, new HashMap<>());
    }
}
