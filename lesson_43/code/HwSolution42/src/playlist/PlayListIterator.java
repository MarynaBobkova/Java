package playlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Andrej Reutow
 * created on 08.11.2023
 */
public class PlayListIterator implements Iterator<String> {

    private int currentPos;

    private final String[] SONGS;

    public PlayListIterator(final String[] SONGS) {
        this.SONGS = SONGS;
    }

    @Override
    public boolean hasNext() {
        return currentPos < SONGS.length;
    }

    @Override
    public String next() {
        // boolean b = true;
        // if (b) - условие выполнено
        // if (!b) - условие не выполнено
        // b = false;
        // if (!b) - условие выполнено
        if (!hasNext()) {
            throw new NoSuchElementException("Песен в playlist больше нет");
        }
        return SONGS[currentPos++];
    }
}
