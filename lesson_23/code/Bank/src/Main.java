/**
 * Главный класс для выполнения операций с банком и банкоматом.
 */
public class Main {
    public static void main(String[] args) {
        Bank santanderBank = initSantanderBank();
        Bank sparkasseBank = initSparkasseBank();

        ATM sparkasseAtm = new ATM(sparkasseBank);
        ATM santanderAtm = new ATM(santanderBank);

        BankCard myBankCard = new BankCard("Andre", "Reutow");

//        santanderAtm.deposit(myBankCard, 1000);
//        santanderAtm.withdraw(myBankCard, 100);
//        santanderAtm.showBalance(myBankCard);
//
//        santanderAtm.deposit(myBankCard, 10);
//        santanderAtm.withdraw(myBankCard, 500);
//        santanderAtm.showBalance(myBankCard);


        BankCard bankCardSp = new BankCard("Max", "Mustermann");
        santanderAtm.showBalance(bankCardSp);
        sparkasseAtm.showBalance(bankCardSp);
    }

    public static Bank initSantanderBank() {
        Bank bank = new Bank();

        BankCard bankCard1 = new BankCard("Andre", "Reutow");
        BankCard bankCard2 = new BankCard("Andre", "Reutow");
        BankCard bankCard3 = new BankCard("John", "Doe");

        bank.addCard(bankCard1);
        bank.addCard(bankCard2);
        bank.addCard(bankCard3);

        return bank;
    }

    public static Bank initSparkasseBank() {
        Bank sparkasseBank = new Bank(10);
        BankCard bankCardSp = new BankCard("Max", "Mustermann");
        sparkasseBank.addCard(bankCardSp);

        return sparkasseBank;
    }
}

