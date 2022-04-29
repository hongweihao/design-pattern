package pri.hongweihao.ch02.ch02_6_dependency_inversion_principle.bad;

import pri.hongweihao.ch02.ch02_6_dependency_inversion_principle.UserInfo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DrawService {
    /**
     * 随机抽奖
     * @param userInfos 参与抽奖用户列表
     * @param count 中奖人数
     * @return 中奖用户列表
     */
    public List<UserInfo> drawRandom(List<UserInfo> userInfos, int count) {
        Collections.shuffle(userInfos);
        return userInfos.stream().limit(count).collect(Collectors.toList());
    }

    /**
     * 权重抽奖，权重最高的人获奖
     * @param userInfos 参与抽奖用户列表
     * @param count 中奖人数
     * @return 中奖用户列表
     */
    public List<UserInfo> drawWeight(List<UserInfo> userInfos, int count) {
        return userInfos.stream().sorted(Comparator.comparing(UserInfo::getWeight)).limit(count).collect(Collectors.toList());
    }
}
