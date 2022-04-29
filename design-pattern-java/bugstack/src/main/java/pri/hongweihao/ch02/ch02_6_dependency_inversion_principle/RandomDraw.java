package pri.hongweihao.ch02.ch02_6_dependency_inversion_principle;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RandomDraw implements IDraw{
    @Override
    public List<UserInfo> draw(List<UserInfo> userInfos, int count) {
        Collections.shuffle(userInfos);
        return userInfos.stream().limit(count).collect(Collectors.toList());
    }
}
