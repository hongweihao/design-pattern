package pri.hongweihao.ch02.ch02_6_dependency_inversion_principle;

import java.util.List;

public class DrawService {
    public List<UserInfo> draw(IDraw draw, List<UserInfo> userInfos, int count) {
        return draw.draw(userInfos, count);
    }
}
