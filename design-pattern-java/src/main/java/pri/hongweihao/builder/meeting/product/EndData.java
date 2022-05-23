package pri.hongweihao.builder.meeting.product;

public class EndData extends AbstractData {
    private final String user;

    public EndData(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "EndData:{user= " + this.user + "}";
    }
}
