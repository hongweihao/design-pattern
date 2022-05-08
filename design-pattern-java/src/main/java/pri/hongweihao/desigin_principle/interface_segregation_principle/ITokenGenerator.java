package pri.hongweihao.desigin_principle.interface_segregation_principle;

import java.util.Date;

// token 生成接口
public interface ITokenGenerator {
    String generate(String userId, Date expire);
}
