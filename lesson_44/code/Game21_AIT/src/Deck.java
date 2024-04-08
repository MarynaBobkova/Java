import java.util.Iterator;
import java.util.Random;

/**
 * @author Andrej Reutow
 * created on 08.11.2023
 */
// колода
public class Deck implements Iterable<Card> {

    // колода карт
    private Card[] cards;

    /**
     * Конструктор для создания колоды всех карт. Всего ровно 36 карт
     */
    public Deck() {
        this.cards = new Card[36];
        fillCards();
        shuffle();
    }

    public void fillCards() {
        String[] suits = {"Пики", "Червы", "Бубны", "Трефы"};
        int index = 0;
        for (String suit : suits) {
            for (int cardValue = 2; cardValue <= 10; cardValue++) {
                this.cards[index++] = new Card(cardValue, suit);
            }
        }

//        for (int i = 0, suitsLength = suits.length; i < suitsLength; i++) {
//            String suit = suits[i];
//            for (int cardValue = 2; cardValue <= 10; cardValue++) {
//                this.cards[index++] = new Card(cardValue, suit);
//            }
//        }
    }

    /**
     * Метод shuffle() для перемешивания колоды.
     */
    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            Card temp = cards[index];   // сохраняем элемент во временную переменную
            cards[index] = cards[i];    // заменяю элемент по индексу на текущий итерируемый
            cards[i] = temp;            // заменяю выбраранный случайный элемент в текущий итерируемый индекс
        }
    }

    public Card[] getCards() {
        return cards;
    }

    /**
     * Реализация интерфейса Iterator/Iterable для перебора карт в колоде.
     */
    @Override
    public Iterator<Card> iterator() {
        return new Iterator<>() {
            private int curPos;

            @Override
            public boolean hasNext() {
                return curPos < cards.length;
            }

            @Override
            public Card next() {
                return cards[curPos++];
            }
        };
    }
}
