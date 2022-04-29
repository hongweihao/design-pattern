package pri.hongweihao.ch02.ch02_5_interface_segregation_principle;

import java.util.Date;

// token 生成接口
public interface ITokenGenerator {
    String generate(String userId, Date expire);
}
