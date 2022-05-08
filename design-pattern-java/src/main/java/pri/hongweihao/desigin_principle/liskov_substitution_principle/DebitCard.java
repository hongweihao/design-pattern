package pri.hongweihao.desigin_principle.liskov_substitution_principle;

/**
 * <p>
 * 储蓄卡
 * </p>
 *
 * @author Karl
 * @date 2022/4/27 9:17
 */
public class DebitCard extends BankCard {
    // 取钱/消费
    public void withdraw() {
        System.out.println("取钱/消费");
        super.debit();
    }

    // 储蓄
    public void deposit(){
        System.out.println("储蓄存钱");
        super.credit();
    }

    // 查询流水
    public void flow(){
        System.out.println("流水信息");
    }
}
