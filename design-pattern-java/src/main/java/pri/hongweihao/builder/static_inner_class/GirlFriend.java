package pri.hongweihao.builder.static_inner_class;

/**
 * <p>
 * 简单的建造者实现，和 Lombok 的 @builder是相同的思路
 * </p>
 *
 * @author Karl
 * @date 2022/5/20 16:14
 */
public class GirlFriend {
    // 发型
    private final String hair;
    // 穿着
    private final String dress;
    // 性格
    private final String character;
    // ......

    private GirlFriend(String hair, String dress, String character) {
        this.hair = hair;
        this.dress = dress;
        this.character = character;
    }

    public static GirlfriendBuilder builder() {
        return new GirlfriendBuilder();
    }

    public void print() {
        System.out.println("我建造了一个女朋友");
        System.out.println("她留着" + this.hair);
        System.out.println("她穿着" + this.dress);
        System.out.println("她的性格" + this.character);
        System.out.println("哇，我好幸福！");
    }

    public static class GirlfriendBuilder {
        // 发型
        private String hair;
        // 穿着
        private String dress;
        // 性格
        private String character;

        public GirlfriendBuilder hair(String hair) {
            this.hair = hair;
            return this;
        }

        public GirlfriendBuilder dress(String dress) {
            this.dress = dress;
            return this;
        }

        public GirlfriendBuilder character(String character) {
            this.character = character;
            return this;
        }

        public GirlFriend build() {
            return new GirlFriend(this.hair, this.dress, this.character);
        }
    }
}
