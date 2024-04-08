import java.util.Scanner;

public class Solution {
    // Задача 1: Палиндром
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase(); // Убираем пробелы и приводим к нижнему регистру
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Задача 2: Анаграммы
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase(); // Убираем пробелы и приводим к нижнему регистру
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Для английского алфавита
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    // Задача 3: Сравнение версий
    public static int compareVersions(String version1, String version2) {
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");

        int minLength = Math.min(parts1.length, parts2.length);

        for (int i = 0; i < minLength; i++) {
            int num1 = Integer.parseInt(parts1[i]);
            int num2 = Integer.parseInt(parts2[i]);
            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
        }

        if (parts1.length < parts2.length) {
            return -1;
        } else if (parts1.length > parts2.length) {
            return 1;
        } else {
            return 0;
        }
    }

    // Задача 4: Удаление символов
    public static String removeChar(String str, char target) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != target) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    // Задача 5: Уникальные символы
    public static boolean hasUniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Задача 1
//        System.out.println("Введите строку для проверки на палиндром: ");
//        String palindromeStr = scanner.nextLine();
//        boolean isPal = isPalindrome(palindromeStr);
//        System.out.println("Это палиндром: " + isPal);
//
//        // Задача 2
//        System.out.println("Введите две строки для проверки на анаграммы (через пробел): ");
//        String anagramStr1 = scanner.next();
//        String anagramStr2 = scanner.next();
//        boolean areAnagrams = areAnagrams(anagramStr1, anagramStr2);
//        System.out.println("Это анаграммы: " + areAnagrams);

        // Задача 3
        System.out.println("Введите две версии для сравнения (через пробел): ");
        while (true) {
            String version1 = scanner.next();
            String version2 = scanner.next();
            int comparison = compareVersions(version1, version2);
            if (comparison < 0) {
                System.out.println(version1 + " меньше " + version2);
            } else if (comparison > 0) {
                System.out.println(version1 + " больше " + version2);
            } else {
                System.out.println(version1 + " равно " + version2);
            }
        }

//        // Задача 4
//        System.out.println("Введите строку и символ для удаления (через пробел): ");
//        String removeStr = scanner.next();
//        char targetChar = scanner.next().charAt(0);
//        String removedStr = removeChar(removeStr, targetChar);
//        System.out.println("Строка после удаления символа: " + removedStr);
//
//        // Задача 5
//        System.out.println("Введите строку для проверки на уникальные символы: ");
//        String uniqueStr = scanner.next();
//        boolean hasUnique = hasUniqueCharacters(uniqueStr);
//        System.out.println("Содержит только уникальные символы: " + hasUnique);
    }
}

