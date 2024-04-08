package playlist;

import java.util.Iterator;

/**
 * @author Andrej Reutow
 * created on 08.11.2023
 */

//Создайте класс Playlist, который реализует Iterable и содержит список песен. Реализовать итератор,
// который позволяет переключаться между песнями.
public class Playlist implements Iterable<String> {

    private String[] songs;
    private int size;

    public Playlist(int playListSize) {
        this.songs = new String[playListSize];
    }

    public boolean addSong(String song) {
        songs[size++] = song;
        return true;
    }

    @Override
    public Iterator<String> iterator() {
        return new PlayListIterator(songs);
    }

    // второй вариант с использованием ананимного класса
//    @Override
//    public Iterator<String> iterator() {
//        return new Iterator<>() {
//            private int currentPos;
//
//            @Override
//            public boolean hasNext() {
//                return currentPos < songs.length;
//            }
//
//            @Override
//            public String next() {
//                if (!hasNext()) {
//                    throw new NoSuchElementException("Песен в playlist больше нет");
//                }
//                return songs[currentPos++];
//            }
//        };
//    }
}
