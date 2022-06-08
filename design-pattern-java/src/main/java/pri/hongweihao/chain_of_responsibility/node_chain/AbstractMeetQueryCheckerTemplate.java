package pri.hongweihao.chain_of_responsibility.node_chain;

import java.util.Map;
import java.util.Objects;

public abstract class AbstractMeetQueryCheckerTemplate implements IMeetQueryChecker {
    protected IMeetQueryChecker next;

    @Override
    public boolean setNext(IMeetQueryChecker checker) {
        this.next = checker;
        return true;
    }

    @Override
    public boolean check(Map<String, String> request, Map<String, Object> context) {
        if (doCheck(request, context) && !Objects.isNull(this.next)) {
            return this.next.check(request, context);
        }
        return false;
    }

    public abstract boolean doCheck(Map<String, String> request, Map<String, Object> context);
}
