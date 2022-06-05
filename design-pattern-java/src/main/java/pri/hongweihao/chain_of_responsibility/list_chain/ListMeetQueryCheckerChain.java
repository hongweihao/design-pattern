package pri.hongweihao.chain_of_responsibility.list_chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListMeetQueryCheckerChain {
    private final List<IMeetQueryChecker> checkerList = new ArrayList<>();

    public boolean addChecker(IMeetQueryChecker checker) {
        return checkerList.add(checker);
    }

    public boolean check(Map<String, String> request, Map<String, Object> context) {
        for (IMeetQueryChecker checker : checkerList) {
            if (!checker.check(request, context)) {
                return false;
            }
        }
        return true;
    }
}
