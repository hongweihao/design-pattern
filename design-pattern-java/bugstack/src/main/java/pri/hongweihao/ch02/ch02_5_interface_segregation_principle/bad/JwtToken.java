package pri.hongweihao.ch02.ch02_5_interface_segregation_principle.bad;

import pri.hongweihao.ch02.ch02_5_interface_segregation_principle.UserInfo;

public class JwtToken implements IToken<UserInfo>{

    @Override
    public String generate(UserInfo payload, long expire) {
        return null;
    }

    @Override
    public UserInfo parse(String token) {
        return null;
    }
}
