package pri.hongweihao.chain_of_responsibility.node_chain;

import java.util.Map;

public abstract class AbstractMeetQueryCheckerTemplate implements IMeetQueryChecker {
    protected IMeetQueryChecker next;

    @Override
    public boolean setNext(IMeetQueryChecker checker) {
        this.next = checker;
        return true;
    }

    @Override
    public boolean check(Map<String, String> request, Map<String, Object> context) {
        if (!doCheck(request, context)) {
            return this.next.check(request, context);
        }
        return true;
    }

    public abstract boolean doCheck(Map<String, String> request, Map<String, Object> context);
}
