/**
 * Главный класс для выполнения операций с банком и банкоматом.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(50);

        BankCard bankCard = new BankCard("Andre", "Reutow");
        bank.addCard(bankCard);

        ATM atm = new ATM();
        atm.withdraw(bankCard, 100);
        atm.deposit(bankCard, 100);
        atm.showBalance(bankCard);
    }
}

