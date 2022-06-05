package pri.hongweihao.chain_of_responsibility.node_chain;

import java.util.Map;

public interface IMeetQueryChecker {
    boolean setNext(IMeetQueryChecker checker);

    boolean check(Map<String, String> request, Map<String, Object> context);
}
