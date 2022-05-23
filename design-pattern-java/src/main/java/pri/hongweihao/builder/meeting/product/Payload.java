package pri.hongweihao.builder.meeting.product;

/**
 * <p>
 * 女朋友
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 16:14
 */
public class Payload<T extends AbstractData> {
    // 事件类型
    private final String event;
    // 事件数据
    private final T data;
    // 推送时间戳
    private final Long timestamp;
    // ......

    public Payload(String event, T data) {
        this.event = event;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }

    public void print() {
        System.out.println("payload:---------");
        System.out.println("event: " + this.event);
        System.out.println("data: " + this.data.toString());
        System.out.println("timestamp: " + this.timestamp);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Payload<JoinData> joinDataPayload = new Payload<>("JOIN", new JoinData("user1"));
        joinDataPayload.print();


    }

}
