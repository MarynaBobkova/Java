// Создаем класс ATM
public class ATM {
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    // Метод для внесения денег на карту
    public void deposit(BankCard card, double amount) {
        int cardNumber = bank.findCard(card);
        if (cardNumber != -1) {
            // Найдена карта, вносим деньги
            System.out.println("Деньги внесены на карту с номером " + cardNumber);
        } else {
            System.out.println("Карта не найдена.");
        }
    }

    // Метод для снятия денег с карты
    public void withdraw(BankCard card, double amount) {
        int cardNumber = bank.findCard(card);
        if (cardNumber != -1) {
            // Найдена карта, проверяем баланс и снимаем деньги, если достаточно средств
            System.out.println("Деньги сняты с карты с номером " + cardNumber);
        } else {
            System.out.println("Карта не найдена.");
        }
    }

    // Метод для отображения баланса карты
    public void showBalance(BankCard card) {
        int cardNumber = bank.findCard(card);
        if (cardNumber != -1) {
            // Найдена карта, выводим баланс
            System.out.println("Баланс карты с номером " + cardNumber + ": " + card.getBalance());
        } else {
            System.out.println("Карта не найдена.");
        }
    }
}
