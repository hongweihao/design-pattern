package pri.hongweihao.desigin_principle.dependency_inversion_principle;

import java.util.List;

public class DrawService {
    public List<UserInfo> draw(IDraw draw, List<UserInfo> userInfos, int count) {
        return draw.draw(userInfos, count);
    }
}
