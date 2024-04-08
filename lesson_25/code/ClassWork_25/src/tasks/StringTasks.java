package tasks;

public class StringTasks {

    // Задача 1: Реализуйте метод, который проверяет, является ли строка палиндромом.
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Задача 2: Реализуйте метод, который подсчитает количество цифр в строке.
    public static int countDigits(String str) {
        int count = 0;

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c >= '0' && c <= '9') {
                count++;
            }
        }

//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                count++;
//            }
//        }
        return count;
    }

    // Задача 3: Реализуйте метод, который подсчитает количество только букв верхнего регистра в строке.
    public static int countUppercaseLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }

    // Задача 4: Реализуйте метод, который принимает строку и возвращает новую строку, в которой все слова перевернуты, но порядок слов остается прежним.
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            result += reversedWord + " ";
        }
        return result.trim();
    }

    public static String reverseWords2(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            result += reversedWord + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("radar"));  // true
        System.out.println(countDigits("I am agent 007"));  // 3
        System.out.println(countUppercaseLetters("Hello World"));  // 2
        System.out.println(reverseWords("Hello World"));  // olleH dlroW
    }
}
