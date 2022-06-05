package pri.hongweihao.chain_of_responsibility.list_chain;

import java.util.Map;

public class UserChecker implements IMeetQueryChecker {
    @Override
    public boolean check(Map<String, String> request, Map<String, Object> context) {
        System.out.println("查询用户是否存在...");
        context.put("user", "USER_INFO");
        return true;
    }
}
