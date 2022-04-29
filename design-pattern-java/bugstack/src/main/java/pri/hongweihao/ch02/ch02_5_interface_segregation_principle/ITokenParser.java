package pri.hongweihao.ch02.ch02_5_interface_segregation_principle;

// token 解析接口
public interface ITokenParser<T> {
    T parse(String token);
}
