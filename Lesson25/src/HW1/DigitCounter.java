package HW1;
/* Задача 1. Реализуйте метод, который подсчитает количество цифр в строке.
 Пример 1: Дана строка "I am agent 007", Результат: В строке 3 цифр(ы)
Пример 2: Дана строка "In 2022, I went to the sea twice", Результат: В строке 4 цифр(ы)
Пример 3: Дана строка "I was in Berlin 3 times in 2023, and in 2022 I was there twice", Результат: В строке 9 цифр( ы)
        попробуйте разные подходы, с разбиением стоки на массив символов и с использованием charAt

 */


public class DigitCounter {
    public static void main(String[] args) {
        String inputString = "I am agent 007";
        String inputString2 = "In 2022, I went to the sea twice";
        String inputString3 = "I was in Berlin 3 times in 2023, and in 2022 I was there twice";
        int numberOfDigits = countDigits(inputString);
        int numberOfDigits2 = countDigits(inputString2);
        int numberOfDigits3 = countDigits(inputString3);
        System.out.println("Number of digits in the string: " + numberOfDigits);
        System.out.println("Number of digits in the string: " + numberOfDigits2);
        System.out.println("Number of digits in the string: " + numberOfDigits3);

    }
    public static int countDigits(String inputString) {
        int digitCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        return digitCount;
    }



}

