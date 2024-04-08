import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 08.11.2023
 */
public class Player {

    private final String NAME;

    /**
     * Карты игрока в текущем раунде
     */
    private Card[] hand;

    /**
     * сумарное значение карт в руках игрока
     */
    private int score; // 0
    /**
     * Общий счет за всю игру/ количество побед
     */
    private int totalScore;

    // Конструктор для инициализации имени игрока и начального состояния.
    public Player(String name) {
        this.NAME = name;
        this.hand = new Card[0];
    }

    // Метод drawCard(Card card) для добавления карты в руку и обновления счета score.
    public void drawCard(Card card) {
        Card[] copy = Arrays.copyOf(this.hand, this.hand.length + 1);
        copy[copy.length - 1] = card;
        this.hand = copy;

        this.score += card.getVALUE();
    }

    // Метод resetRound() для сброса руки и счета за раунд.
    public void resetRound() {
        this.score = 0;
        this.hand = new Card[0];
    }

    // Метод addPointToTotalScore() для добавления балла к общему счету.
    public void addPointToTotalScore() {
        this.totalScore++;
    }
}
