package Game21.src;

public class Card implements Comparable<Card>{
    private final int VALUE;
    private final String SUIT; // масть карты.
//Конструктор для инициализации карты с указанными значениями.
    public Card(int value, String suit) {
        this.VALUE = value;
        this.SUIT = suit;
    }
    //Геттеры для доступа к полям класса.

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
        return SUIT.equals(card.SUIT);
    }

    @Override
    public int hashCode() {
        int result = VALUE;
        result = 31 * result + SUIT.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return SUIT + " " + VALUE;
    }

    @Override
    public int compareTo(Card other) {
        int suitCompare = this.SUIT.compareTo(other.getSUIT())
        return suitCompare != 0 ? ;
    }
}
