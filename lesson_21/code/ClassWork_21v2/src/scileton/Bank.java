package scileton;

/**
 * Класс для представления банка и хранения карт.
 */
public class Bank {
    private BankCard[] cards;
    private int maxCards;
    private int numCards;

    // Конструкторы и геттеры/сеттеры

    /**
     * Метод для добавления новой карты в банк.
     *
     * @param card Карта, которую нужно добавить.
     */
    public void addCard(BankCard card) {
        // Реализация метода
    }

    /**
     * Метод для поиска карты в банке.
     *
     * @param card Карта, которую нужно найти.
     * @return Номер карты, если она найдена; -1, если карта не найдена.
     */
    public int findCard(BankCard card) {
        // Реализация метода
        return -1;
    }
}
