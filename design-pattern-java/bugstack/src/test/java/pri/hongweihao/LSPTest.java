package pri.hongweihao;

import org.junit.Test;
import pri.hongweihao.ch02.ch02_3_liskov_substitution_principle.BankCard;
import pri.hongweihao.ch02.ch02_3_liskov_substitution_principle.CreditCard;
import pri.hongweihao.ch02.ch02_3_liskov_substitution_principle.DebitCard;

/**
 * <p>
 * 里氏替换原则测试类
 * </p>
 *
 * @author Karl
 * @date 2022/4/28 13:28
 */
public class LSPTest {
    @Test
    public void test1() {
        pri.hongweihao.ch02.ch02_3_liskov_substitution_principle.bad.DebitCard debitCard = new pri.hongweihao.ch02.ch02_3_liskov_substitution_principle.bad.DebitCard();
        pri.hongweihao.ch02.ch02_3_liskov_substitution_principle.bad.DebitCard creditCard = new pri.hongweihao.ch02.ch02_3_liskov_substitution_principle.bad.CreditCard();

        debitCard.withdraw();
        debitCard.deposit();

        creditCard.withdraw();
        creditCard.deposit();
    }

    @Test
    public void test2() {
        BankCard bankCard = new BankCard();
        BankCard debitCard = new DebitCard();
        BankCard creditCard = new CreditCard();

        bankCard.debit();
        bankCard.credit();

        debitCard.debit();
        debitCard.credit();

        creditCard.debit();
        creditCard.credit();
    }
}
