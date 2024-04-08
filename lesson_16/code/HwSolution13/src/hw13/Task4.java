package hw13;

import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 26.09.2023
 * Пользователь вводит нескольких слов.
 * Сохраните каждое слово в массиве и выведите все слова в обратном порядке.
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[4];

        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word: " + (i + 1));
            String word = scanner.nextLine();
            words[i] = word;
        }

        printReversed(words);
    }

    public static void printReversed(String[] words) {
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + "\t");
        }
    }
}

