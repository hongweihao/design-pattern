package pri.hongweihao.builder.build_girlfriend;

/**
 * <p>
 * 女朋友
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

    public GirlFriend(String hair, String dress, String character) {
        this.hair = hair;
        this.dress = dress;
        this.character = character;
    }

    public void print() {
        System.out.println("国家分配了一个女朋友");
        System.out.println("她留着" + this.hair);
        System.out.println("她穿着" + this.dress);
        System.out.println("她的性格" + this.character);
        System.out.println("哇，我好幸福！");
    }
}
