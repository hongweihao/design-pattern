package pri.hongweihao.chain_of_responsibility.node_chain;

import java.util.Map;
import java.util.Objects;

public class NodeMeetQueryCheckerChain {
    private IMeetQueryChecker head;
    private IMeetQueryChecker tail;

    public boolean addChecker(IMeetQueryChecker checker) {
        if (Objects.isNull(tail)) {
            head = checker;
        } else {
            tail.setNext(checker);
        }
        tail = checker;
        return true;
    }

    public boolean check(Map<String, String> request, Map<String, Object> context) {
        return head.check(request, context);
    }
}
