import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 08.11.2023
 */
public class Card {
    /**
     * Значение карты от 1 до 10.
     */
    private final int VALUE;
    /**
     * масть карты.
     */
    private final String SUIT;

    /**
     * Конструктор для инициализации карты с указанными значениями.
     */
    public Card(int value, String suit) {
        this.VALUE = value;
        this.SUIT = suit;
    }

    public int getVALUE() {
        return VALUE;
    }

    public String getSUIT() {
        return SUIT;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Card card = (Card) object;

        if (VALUE != card.VALUE) return false;
        return Objects.equals(SUIT, card.SUIT);
    }

    @Override
    public int hashCode() {
        int result = VALUE;
        result = 31 * result + (SUIT != null ? SUIT.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return SUIT + " " + VALUE;
    }
}
