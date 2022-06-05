package pri.hongweihao.chain_of_responsibility.node_chain;

import java.util.Map;

public class MeetChecker extends AbstractMeetQueryCheckerTemplate {
    @Override
    public boolean doCheck(Map<String, String> request, Map<String, Object> context) {
        System.out.println("查询会议是否存在...");
        context.put("meet", "MEET_INFO");
        return true;
    }
}
