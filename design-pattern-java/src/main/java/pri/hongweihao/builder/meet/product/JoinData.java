package pri.hongweihao.builder.meet.product;

public class JoinData extends AbstractData {
    private final String user;

    public JoinData(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "JoinData:{user= " + this.user + "}";
    }
}
