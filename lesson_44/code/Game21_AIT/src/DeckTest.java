import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Andrej Reutow
 * created on 08.11.2023
 */
@DisplayName("Тестирование колоды")
class DeckTest {


    private Deck deck;


    @BeforeEach
    void setUp() {
        deck = new Deck();
    }

    @Test
    public void test_fillArray() {
        deck.fillCards();

        Card[] cards = deck.getCards();

        for (Card card : cards) {
            Assertions.assertNotNull(card);
        }
    }

    @Test
    public void test_shuffle() {
//        deck.fillCards();
//        Card[] cards = deck.getCards();

//        deck.shuffle();
        Card[] shuffleCards = deck.getCards();

        System.out.println();
    }
}
