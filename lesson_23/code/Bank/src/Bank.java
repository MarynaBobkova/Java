import constants.AppConstants;

/**
 * Класс для представления банка и хранения карт.
 */
public class Bank {
    private BankCard[] cards;
    private int maxCards;
    private int numCards;

    public Bank(int maxCards) {
        this.maxCards = maxCards;
        this.cards = new BankCard[maxCards];
    }

    public Bank() {
        this.maxCards = AppConstants.DEFAULT_CARDS_SIZE; // 50
        this.cards = new BankCard[this.maxCards]; // cards.l = 50
    }


    // Конструкторы и геттеры/сеттеры

    /**
     * Метод для добавления новой карты в банк.
     *
     * @param card Карта, которую нужно добавить.
     */
    public void addCard(BankCard card) {
        //AndreReutow
        String generatedCardNumber = card.getFirstName() + card.getLastName();
        card.setCardNumber(generatedCardNumber);
        card.setBalance(0);
        // todo пройтись по всему массиву и найти пустую ячейку для установки карточки
        // Если пустой ячейки нет, то указать пользователю, что наш банк больше не может принимать новых клиентов
        // card[] = card;

        boolean isCardExists = findCard(card);
        if (isCardExists) {
            System.out.println("Карта " + card.getCardNumber() + " уже добавлена");
            return;
        }

        boolean isAdded = false;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = card;
                System.out.println("Крата с номерном " + card.getCardNumber() + " добавлена");
                isAdded = true;
                break;
//                return;
            }
        }

//        if (isAdded == false) {
        if (!isAdded) {
            // !true  isAdded == false true
            System.out.println(AppConstants.CLIENT_AMOUNT_LIMIT);
        }
    }

    /**
     * Метод для поиска карты в банке.
     *
     * @param card Карта, которую нужно найти.
     * @return Если карточка найдена true, в противном случае false
     */
    public boolean findCard(BankCard card) {
        if (card == null) {
            return false;
        }

        for (int i = 0; i < cards.length; i++) {
            final BankCard currentElement = cards[i];
            if (currentElement != null && currentElement.equals(card)) {
                System.out.println(AppConstants.CARD_FOUND_MESSAGE + card.getCardNumber() + " найдена под индексом: " + i);
                return true;
            }
        }

        System.out.println(AppConstants.CARD_FOUND_MESSAGE + card.getCardNumber() + " не найдена");
        return false;
    }
}
