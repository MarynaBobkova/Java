package playlist;

import java.util.Iterator;

/**
 * @author Andrej Reutow
 * created on 08.11.2023
 */

//Создайте класс Playlist, который реализует Iterable и содержит список песен. Реализовать итератор,
// который позволяет переключаться между песнями.

public class PlaylistApp {

    public static void main(String[] args) {
        Playlist playList = new Playlist(3);
        playList.addSong("Song 1");
        playList.addSong("Song 2");
        playList.addSong("Song 3");

        for (String song : playList) {
            System.out.println(song);
        }

        Iterator<String> iterator = playList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // в этом случае метод next() выбросит ошибку NoSuchElementException
//        iterator = playList.iterator();
//        while (true) {
//            System.out.println(iterator.next());
//        }

        int[] ints = {1, 3, 5};
        for (int num : ints) {
            System.out.println(num);
        }
    }
}
