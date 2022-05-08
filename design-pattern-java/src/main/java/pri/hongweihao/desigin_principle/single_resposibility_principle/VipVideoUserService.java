package pri.hongweihao.desigin_principle.single_resposibility_principle;

/**
 * <p>
 * VIP 用户
 * </p>
 *
 * @author Karl
 * @date 2022/4/14 13:50
 */
public class VipVideoUserService implements IVideoUserService{
    @Override
    public String definition() {
        return "能观看 1080P 清晰度的视频";
    }

    @Override
    public String advertise() {
        return "无广告";
    }
}
