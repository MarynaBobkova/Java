package HW1.Palindr;

import java.util.Scanner;
//Напишите программу, которая принимает строку с клавиатуры и определяет,
// является ли она палиндромом (строкой, которая читается одинаково с начала и с конца, игнорируя пробелы
// и регистр символов) и напишите тесты.

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: " );
        String str= scanner.nextLine();

        System.out.println(isPalindrome(str));


    }

    public static boolean isPalindrome (String str) {
        str = str.replace(" ", "");
        str = str.toLowerCase();

        for (int left = 0; left < str.length() ; left++) {
            // i = 0     str.length() - 1
            // i = 1     str.length() - 2
            // i = 2     str.length() - 3
            // i = 3     str.length() - 4

            int right = str.length() - (left+1);
            if (str.charAt(right) != str.charAt(left)) {
                return false;
            }
        }
        return true;
    }

}
