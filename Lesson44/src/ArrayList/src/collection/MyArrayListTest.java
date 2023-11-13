package ArrayList.src.collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyList<Integer> integerMyList = new MyArrayList<>();

    @BeforeEach
    void init() {
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);
    }

    @Test
    void add() {

    }

    @Test
    void get() {
    }

    @Test
    void set() {
    }

    @Test
    void size() {
    }

    @Test
    void contains() {
    }

    @Test
    void remove() {
    }

    @Test
    void removeByIndex() {
    }
}