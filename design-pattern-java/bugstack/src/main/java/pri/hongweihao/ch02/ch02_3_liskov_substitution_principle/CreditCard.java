package pri.hongweihao.ch02.ch02_3_liskov_substitution_principle;

/**
 * <p>
 * 信用卡
 * </p>
 *
 * @author Karl
 * @date 2022/4/27 9:24
 */
public class CreditCard extends BankCard {
    // 贷款，生成贷款单
    public void loan() {
        System.out.println("贷款，生成贷款单");
        super.debit();
    }

    // 还款，生成还款单
    public void repay() {
        System.out.println("还款，生成还款单");
        super.credit();
    }

    // 查询流水
    @Override
    public void flow() {
        super.flow();
    }
}
