package pri.hongweihao.ch02.ch02_3_liskov_substitution_principle.bad;

/**
 * <p>
 * 信用卡
 * </p>
 *
 * @author Karl
 * @date 2022/4/27 9:24
 */
public class CreditCard extends DebitCard {
    // 消费，生成贷款单
    @Override
    public void withdraw() {
        // 重写了父类的方法，而且行为完全不同
        System.out.println("生成带贷款单");
    }

    // 还信用卡，生成还款单
    @Override
    public void deposit() {
        // 重写了父类的方法，而且行为完全不同
        System.out.println("生成还款单");
    }

    // 查询流水
    @Override
    public void flow() {
        super.flow();
    }
}
