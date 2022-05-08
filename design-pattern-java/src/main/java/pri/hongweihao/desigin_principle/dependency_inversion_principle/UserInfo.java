package pri.hongweihao.desigin_principle.dependency_inversion_principle;

public class UserInfo {
    // 用户id
    private String userId;
    // 权重
    private Integer weight;

    public UserInfo(String userId, Integer weight) {
        this.userId = userId;
        this.weight = weight;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
