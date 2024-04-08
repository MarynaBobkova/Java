/**
 * @author Andrej Reutow
 * created on 11.10.2023
 */

/**
 * Реализуйте метод, который принимает строку и возвращает новую строку, в которой все слова перевернуты, но порядок слов остается прежним.
 */
public class HwSolution_25 {

    public static String reversedStrings(String value) {
        // Easy come easy go
        // ysaE emoc ysae og
        String[] words = value.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reverseString(word);
            result = result + reversedWord + " ";

//            if (i == words.length - 1) {
//                result = reversedWord;
//            } else {
//                result = reversedWord + " ";
//            }

        }

        return result.trim();
    }

    private static String reverseString(final String text) {
        // Easy
        // ysaE
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        return result;
    }
}
