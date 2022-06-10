package pri.hongweihao.adapter;

/**
 * <p>
 * 旧的用户信息查询接口
 * 从本地数据库查询
 * </p>
 *
 * @author Karl
 * @date 2022/6/10 10:24
 */
public interface IUserQuery {
    Object queryById(String id);
}
