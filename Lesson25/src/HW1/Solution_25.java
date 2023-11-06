package HW1;
/* Задача 3*. Реализуйте метод, который принимает строку и возвращает новую строку, в которой все слова перевернуты, но порядок слов остается прежним.
Пример 1: Дана строка "Hello World", Результат: "olleH dlroW"

Пример 2: Дана строка "Java Programming", Результат: "avaJ gnimmargorP"

Пример 3: Дана строка "Easy come easy go", Результат: "ysaE emoc ysae og"

 */

public class Solution_25 {
    public static String reversedStrings(String value) {
        // Easy come easy go", Результат: "ysaE emoc ysae og"
        String[] words = value.split("");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reverseString(word);
            words[i] = reversedWord;
            result += reversedWord + " ";

        }
        return result.trim();

    }
    private static String reverseString(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i++) {
            result += text.charAt(i);

        }
        return result;
    }
}
