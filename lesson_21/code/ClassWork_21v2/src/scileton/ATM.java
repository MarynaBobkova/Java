package scileton;

/**
 * Класс для представления банкомата и выполнения операций с картами.
 */
public class ATM {
    private Bank bank;

    // Конструкторы и геттеры/сеттеры

    /**
     * Метод для внесения денег на карту.
     *
     * @param card   Карта, на которую вносятся деньги.
     * @param amount Сумма, которую нужно внести.
     */
    public void deposit(BankCard card, double amount) {
        // Реализация метода
    }

    /**
     * Метод для снятия денег с карты.
     *
     * @param card   Карта, с которой снимаются деньги.
     * @param amount Сумма, которую нужно снять.
     */
    public void withdraw(BankCard card, double amount) {
        // Реализация метода
    }

    /**
     * Метод для отображения баланса карты.
     *
     * @param card Карта, баланс которой нужно отобразить.
     */
    public void showBalance(BankCard card) {
        // Реализация метода
    }
}
