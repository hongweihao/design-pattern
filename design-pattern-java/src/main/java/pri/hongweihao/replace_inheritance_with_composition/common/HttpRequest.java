package pri.hongweihao.replace_inheritance_with_composition.common;

import lombok.Data;

import java.util.Map;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author Karl
 * @date 2022/3/24 17:30
 */
@Data
public class HttpRequest {
    private String url;
    private HttpMethodEnum method;
    private Map<String, String> query;
    private Map<String, String> header;
    private Map<String, Object> body;
}
