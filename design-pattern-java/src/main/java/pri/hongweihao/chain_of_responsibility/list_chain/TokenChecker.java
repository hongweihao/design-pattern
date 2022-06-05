package pri.hongweihao.chain_of_responsibility.list_chain;

import java.util.Map;

public class TokenChecker implements IMeetQueryChecker {
    @Override
    public boolean check(Map<String, String> request, Map<String, Object> context) {
        System.out.println("校验 token...");
        return true;
    }
}
