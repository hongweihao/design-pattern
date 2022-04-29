package pri.hongweihao.ch02.ch02_5_interface_segregation_principle.bad;


public interface IToken<T> {
    String generate(T payload, long expire);
    T parse(String token);
}
