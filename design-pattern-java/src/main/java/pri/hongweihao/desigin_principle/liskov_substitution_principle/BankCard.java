package pri.hongweihao.desigin_principle.liskov_substitution_principle;

/**
 * <p>
 * 银行卡抽象
 * </p>
 *
 * @author Karl
 * @date 2022/4/27 9:18
 */
public class BankCard {
    // 借 debit （我的钱增加了）
    public void debit() {
        System.out.println("我的钱增加了");
    }

    // 贷 credit （我的钱减少了）
    public void credit() {
        System.out.println("我的钱减少了");
    }

    // 查询流水
    public void flow() {
        System.out.println("查询流水");
    }
}
