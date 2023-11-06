// Задача 4 "Слова в обратном порядке"
//Пользователь вводит нескольких слов. Сохраните каждое слово в массиве и выведите все слова в обратном порядке.

import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {
        String [] words = new String[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type you words: ");
        for (int i = 0; i < words.length; i++) {
            words [i] = scanner.next();
        }

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words [i]);
        }
    }
}
