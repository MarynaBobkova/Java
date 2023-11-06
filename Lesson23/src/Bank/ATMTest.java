package Bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ATMTest {
    @Test

    public  void test_ATM_deposit() {
        Bank bank = new Bank(50);

        BankCard bankCard1 = new BankCard("Andre ", "Reutow");
        bank.addCard(bankCard1);

        ATM atm = new ATM(bank);

        atm.deposit(bankCard1, 200);
        Assertions.assertEquals(bankCard1.getBalance(), 200);

        atm.deposit(bankCard1, 50);
        Assertions.assertEquals(bankCard1.getBalance(), 250);

    }
    @Test
    public void test_ATM_withdraw() {
        Bank bank = new Bank(50);
        BankCard bankCard1 = new BankCard(350, "Andre ", "Reutow");
        bank.addCard(bankCard1);
        ATM atm = new ATM(bank);

        atm.withdraw(bankCard1, 50);
        Assertions.assertEquals(bankCard1.getBalance(), 300);
     
    }

}
