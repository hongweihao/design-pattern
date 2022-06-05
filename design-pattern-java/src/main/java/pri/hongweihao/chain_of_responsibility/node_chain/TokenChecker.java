package pri.hongweihao.chain_of_responsibility.node_chain;

import java.util.Map;

public class TokenChecker extends AbstractMeetQueryCheckerTemplate {
    @Override
    public boolean doCheck(Map<String, String> request, Map<String, Object> context) {
        System.out.println("校验 token...");
        return true;
    }
}
