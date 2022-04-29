package pri.hongweihao.ch02.ch02_6_dependency_inversion_principle;

import java.util.List;

public interface IDraw {
    /**
     * 抽奖
     * @param userInfos 参与抽奖用户列表
     * @param count 中奖人数
     * @return 中奖用户列表
     */
    List<UserInfo> draw(List<UserInfo> userInfos, int count);
}
