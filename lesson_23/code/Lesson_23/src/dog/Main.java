package dog;

import cat.Cat;

/**
 * @author Andrej Reutow
 * created on 06.10.2023
 */
public class Main {
    public static void main(String[] args) {
        final Cat cat = new Cat("Angelina");
        cat.voice();

//        cat = null;               // так не работает, т.к. переменная cat является не изменяемой
//        cat = new Cat("Vajsa");

        Cat cat1 = cat;

//        cat = cat1; // так не работает
    }

    public static void changeName(final int name) {
     //   name = 1; // так не работает, т.к. переменная name является не изменяемой
    }
}
