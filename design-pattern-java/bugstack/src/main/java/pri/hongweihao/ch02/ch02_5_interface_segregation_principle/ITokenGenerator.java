package pri.hongweihao.ch02.ch02_5_interface_segregation_principle;

// token 生成接口
public interface ITokenGenerator<T> {
    String generate(T payload, long expire);
}
