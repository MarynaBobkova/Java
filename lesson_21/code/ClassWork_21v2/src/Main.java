import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(10); // Создаем банк с максимальным количеством карт 10
        ATM atm = new ATM(bank); // Создаем банкомат, связанный с банком

        // Регистрируем карту
        BankCard card1 = new BankCard("Иван", "Иванов");
        bank.addCard(card1);

        // Вносим и снимаем деньги
        atm.deposit(card1, 1000);
        atm.withdraw(card1, 500);

        // Отображаем баланс
        atm.showBalance(card1);
    }
}
