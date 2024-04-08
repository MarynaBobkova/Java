// Создаем класс Bank
public class Bank {
    private BankCard[] cards;
    private int maxCards;
    private int numCards;

    public Bank(int maxCards) {
        this.cards = new BankCard[maxCards];
        this.maxCards = maxCards;
        this.numCards = 0;
    }

    // Метод для добавления новой карты в массив (банк)
    public void addCard(BankCard card) {
        if (numCards < maxCards) {
            // Генерируем уникальный номер карты на основе имени и фамилии владельца
            int cardNumber = card.getFirstName().hashCode() ^ card.getLastName().hashCode();
            card.setCardNumber(cardNumber);

            // Проверяем, что такой карты еще нет в банке
            for (int i = 0; i < numCards; i++) {
                if (cards[i].equals(card)) {
                    System.out.println("Такая карта уже существует.");
                    return;
                }
            }

            // Добавляем карту в массив
            cards[numCards] = card;
            numCards++;
            System.out.println("Карта успешно добавлена.");
        } else {
            System.out.println("Достигнуто максимальное количество карт в банке.");
        }
    }

    // Метод для поиска карты в массиве
    public int findCard(BankCard card) {
        for (int i = 0; i < numCards; i++) {
            if (cards[i].equals(card)) {
                return cards[i].getCardNumber();
            }
        }
        return -1; // Карта не найдена
    }

    public BankCard[] getCards() {
        return cards;
    }

    public void setCards(BankCard[] cards) {
        this.cards = cards;
    }

    public int getMaxCards() {
        return maxCards;
    }

    public void setMaxCards(int maxCards) {
        this.maxCards = maxCards;
    }

    public int getNumCards() {
        return numCards;
    }

    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }
}
