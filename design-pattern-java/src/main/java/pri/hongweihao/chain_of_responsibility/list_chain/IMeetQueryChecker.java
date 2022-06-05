package pri.hongweihao.chain_of_responsibility.list_chain;

import java.util.Map;

public interface IMeetQueryChecker {
    boolean check(Map<String, String> request, Map<String, Object> context);
}
