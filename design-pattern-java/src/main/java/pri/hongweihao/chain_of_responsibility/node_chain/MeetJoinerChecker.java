package pri.hongweihao.chain_of_responsibility.node_chain;

import java.util.Map;

public class MeetJoinerChecker extends AbstractMeetQueryCheckerTemplate {
    @Override
    public boolean doCheck(Map<String, String> request, Map<String, Object> context) {
        System.out.println("查询用户是否会议参会人...");
        return true;
    }
}
