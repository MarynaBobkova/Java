package Bank;

import Bank.AppConstants;

/**
 * Класс для представления банкомата и выполнения операций с картами.
 */
public class ATM {

    private Bank bank;

    // Конструкторы и геттеры/сеттеры


    public ATM(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    /**
     * Метод для внесения денег на карту.
     *
     * @param card   Карта, на которую вносятся деньги.
     * @param amount Сумма, которую нужно внести.
     */
    public void deposit(BankCard card, double amount) {
        //1. проверить есть ли карта (card) в нашем банке (this.bank)
        //Если карта есть в банке, тогда провести оперецию по внусения средств на карту. (card.setBalance(...))
        //Важно, не перезапишите баланс, а добавьтие к текущему балансу значение amount
        // К примеру, если у владельца карты на счету уже есть 1000 евро, и владелец карты хочет пополнить свой счет на 10 евро,
        // после этой опрерации у пользователя должно оказаться на счету 1010 евро, а не 10 евро.
        // Проследите за тем что бы при пополнении счета баланс не перезаписывается
        if (bank.findCard(card)) {
            card.setBalance(card.getBalance()+ amount);
            System.out.println("Баланс карты пополнен на: " + amount);
        } else {
            System.out.println("Карта не найдена");
        }
    }

    /**
     * Метод для снятия денег с карты.
     *
     * @param card   Карта, с которой снимаются деньги.
     * @param amount Сумма, которую нужно снять.
     */
    public void withdraw(BankCard card, double amount) {
        // проверяем есть ли карточка (card) в банке (this.bank)
        if (this.bank.findCard(card)) {
            if(card.getBalance() >= amount) {
                card.setBalance(card.getBalance() - amount);
                System.out.println("С баланса снято: " + amount);
            } else {
                System.out.println(AppConstants.FUNDS_ERROR_MESSAGE);
            }
        } else {
            System.out.println(AppConstants.CARD_ERROR);
        }
    }

    /**
     * Метод для отображения баланса карты.
     *
     * @param card Карта, баланс которой нужно отобразить.
     */
    public void showBalance(BankCard card) {
        System.out.println(AppConstants.BALANCE + card.getBalance());
    }

}
