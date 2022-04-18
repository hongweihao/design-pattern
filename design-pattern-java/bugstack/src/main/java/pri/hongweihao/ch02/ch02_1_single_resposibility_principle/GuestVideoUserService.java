package pri.hongweihao.ch02.ch02_1_single_resposibility_principle;

/**
 * <p>
 * VIP 用户
 * </p>
 *
 * @author Karl
 * @date 2022/4/14 13:50
 */
public class GuestVideoUserService implements IVideoUserService{
    @Override
    public String definition() {
        return "能观看 480P 清晰度的视频";
    }
    @Override
    public String advertise() {
        return "有广告";
    }
}
