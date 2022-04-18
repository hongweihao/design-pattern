package pri.hongweihao.ch02.ch02_1_single_resposibility_principle;

/**
 * <p>
 * 根据视频 App 用户类型判断是否能提供的视频清晰度和是否有广告
 * </p>
 *
 * @author Karl
 * @date 2022/4/14 9:27
 */
public class VideoUserService {
    public void handle(String userType) throws Exception {
        if ("GUEST".equals(userType)) {
            // 业务处理
            System.out.println("访客用户，可以观看 480P 清晰度的视频，有广告。");
        } else if ("USER".equals(userType)) {
            //业务处理
            System.out.println("普通用户，可以观看 720P 清晰度的视频，有广告。");
        } else if ("VIP".equals(userType)) {
            //业务处理
            System.out.println("普通用户，可以观看 720P 清晰度的视频，无广告。");
        } else {
            throw new Exception("Unsupported userType: " + userType);
        }
    }
}
