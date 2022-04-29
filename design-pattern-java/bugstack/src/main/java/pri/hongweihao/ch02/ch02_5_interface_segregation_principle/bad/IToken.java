package pri.hongweihao.ch02.ch02_5_interface_segregation_principle.bad;


import java.util.Date;

public interface IToken {
    String generate(String userId, Date expire);
    String parse(String token);
}
