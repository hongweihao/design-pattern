package pri.hongweihao.chain_of_responsibility;

import org.junit.Test;
import pri.hongweihao.chain_of_responsibility.node_chain.*;

import java.util.HashMap;

public class NodeMeetQueryCheckerChainTest {
    @Test
    public void test() {
        IMeetQueryChecker tokenChecker = new TokenChecker();
        IMeetQueryChecker userChecker = new UserChecker();
        IMeetQueryChecker meetChecker = new MeetChecker();
        IMeetQueryChecker meetJoinerChecker = new MeetJoinerChecker();

        NodeMeetQueryCheckerChain chain = new NodeMeetQueryCheckerChain();
        chain.addChecker(tokenChecker);
        chain.addChecker(userChecker);
        chain.addChecker(meetChecker);
        chain.addChecker(meetJoinerChecker);

        chain.check(null, new HashMap<>());
    }
}
