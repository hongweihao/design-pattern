package pri.hongweihao.desigin_principle.interface_segregation_principle.bad;


import java.util.Date;

public interface IToken {
    String generate(String userId, Date expire);
    String parse(String token);
}
