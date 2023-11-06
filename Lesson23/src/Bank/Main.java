package Bank;

 /* Главный класс для выполнения операций с банком и банкоматом.
         */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(50);

        BankCard bankCard1 = new BankCard("Andre ", "Reutow");
        BankCard bankCard2 = new BankCard("Marie ", "Reutowa");
        BankCard bankCard3 = new BankCard("John ", "Doe");

        bank.addCard(bankCard1);
        bank.addCard(bankCard2);
        bank.addCard(bankCard3);
        System.out.println();

        // реализовать конструктов в классе ATM который будет принимать объект Bank

        ATM atm = new ATM(bank);

        atm.deposit(bankCard1, 200);
        atm.showBalance(bankCard1);
        System.out.println();

        atm.withdraw(bankCard2, 100);
        atm.showBalance(bankCard2);
        System.out.println();

        atm.deposit(bankCard3,500);
        atm.withdraw(bankCard3, 50);
        atm.showBalance(bankCard3);
    }
}