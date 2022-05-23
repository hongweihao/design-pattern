package pri.hongweihao.builder.meeting.product;

import java.time.LocalDateTime;

public class ShareEndData extends AbstractData {
    private final String user;
    private final LocalDateTime shareTime;

    public ShareEndData(String user, LocalDateTime shareTime) {
        this.user = user;
        this.shareTime = shareTime;
    }

    @Override
    public String toString() {
        return "ShareStartData:{user= " + this.user + ", " + this.shareTime + "}";
    }
}
