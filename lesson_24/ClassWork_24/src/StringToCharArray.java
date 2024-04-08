/**
 * @author Andrej Reutow
 * created on 08.10.2023
 */
public class StringToCharArray {


    // Задача 1: Подсчет количества гласных букв в строке.
    public static int countVowels(String str) {
        int count = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = Character.toLowerCase(charArray[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // Задача 2: Перевернуть строку.
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        String reversed = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        return reversed;
    }

    // Задача 3: Подсчет количества цифр в строке.
    public static int countDigits(String str) {
        int count = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                count++;
            }
        }
        return count;
    }

    // Задача 4: Заменить все вхождения заданного символа на другой символ.
    public static String replaceChar(String str, char oldChar, char newChar) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == oldChar) {
                charArray[i] = newChar;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello"));  // 2
        System.out.println(reverseString("Java"));  // avaJ
        System.out.println(countDigits("Hello123"));  // 3
        System.out.println(replaceChar("Hello", 'l', 'w'));  // Hewwo
    }
}




