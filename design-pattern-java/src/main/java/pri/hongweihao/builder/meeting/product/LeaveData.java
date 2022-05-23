package pri.hongweihao.builder.meeting.product;

public class LeaveData extends AbstractData {
    private final String user;

    public LeaveData(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LeaveData:{user= " + this.user + "}";
    }
}
