import constants.AppConstants;

/**
 * Класс для представления банкомата и выполнения операций с картами.
 */
public class ATM {

    private final Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    /**
     * Метод для внесения денег на карту.
     *
     * @param card   Карта, на которую вносятся деньги.
     * @param amount Сумма, которую нужно внести.
     */
    public void deposit(BankCard card, double amount) {
        if (this.bank.findCard(card)) {
            card.setBalance(card.getBalance() + amount);
            System.out.println("Сумма " + amount + " внесена на счет");
        }
    }

    /**
     * Метод для снятия денег с карты.
     *
     * @param card   Карта, с которой снимаются деньги.
     * @param amount Сумма, которую нужно снять.
     */
    public void withdraw(BankCard card, double amount) {
        if (!this.bank.findCard(card)) {
            return;
        }

        if (card.getBalance() >= amount) {
            card.setBalance(card.getBalance() - amount);
            System.out.println("Сумма " + amount + " выдана");
        } else {
            System.out.println(AppConstants.BALANCE_ERROR_MESSAGE);
        }
    }

    /**
     * Метод для отображения баланса карты.
     *
     * @param card Карта, баланс которой нужно отобразить.
     */
    public void showBalance(BankCard card) {
        if (!this.bank.findCard(card)) {
            return;
        }

        System.out.println(AppConstants.BALANCE_INFO + card.getBalance());
    }
}
