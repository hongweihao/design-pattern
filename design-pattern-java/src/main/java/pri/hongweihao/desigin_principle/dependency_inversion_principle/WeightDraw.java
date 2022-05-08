package pri.hongweihao.desigin_principle.dependency_inversion_principle;

import java.util.List;
import java.util.stream.Collectors;

public class WeightDraw implements IDraw{
    @Override
    public List<UserInfo> draw(List<UserInfo> userInfos, int count) {
        return userInfos.stream()
                .sorted(((o1, o2) -> o2.getWeight().compareTo(o1.getWeight())))
                .limit(count)
                .collect(Collectors.toList());
    }
}
