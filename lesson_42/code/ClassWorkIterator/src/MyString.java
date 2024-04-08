import java.util.Iterator;

/**
 * @author Andrej Reutow
 * created on 07.11.2023
 */
public class MyString implements Iterable<Character> {

    private StringBuilder source;

    public MyString(String value) {
        this.source = new StringBuilder(value);
    }

    /**
     * добавляет символ
     *
     * @param c символ для добавления
     */
    public void addChar(char c) {
        source.append(c);
    }

    public StringBuilder getSource() {
        return source;
    }

    public void setSource(StringBuilder source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return source.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<>() {

            private int size = source.length();
            private int currentPos;

            /**
             * Есть ли у нас еще символы
             * @return true, если символы есть
             */
            @Override
            public boolean hasNext() {
                return currentPos < size;
            }

            /**
             * Возвращает текущий символ и переходит к следующему
             * @return Возвращает текущий символ
             */
            @Override
            public Character next() {
                Character currentCharacter = source.charAt(currentPos);
                currentPos++;
                return currentCharacter;
            }
        };
    }
}
