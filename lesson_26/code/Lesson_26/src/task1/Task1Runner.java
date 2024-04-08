package task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 11.10.2023
 */
public class Task1Runner {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Input some text 1");
//        String line1 = readLine();
//
//        System.out.println("Input some text 1");
//        String line2 = readLine();
//
//        String[] strings = new String[2];
//        strings[0] = line1;
//        strings[1] = line2;
//
//        System.out.println(Arrays.toString(strings));
//
//        for (int i = 0; i < strings.length; i++) {
//            final String currentLine = strings[i];
//            final int wordCount = TaskUtils.wordCount(currentLine);
//            final String reversedLine = TaskUtils.reverseString(currentLine);
//            final int digitsCaseLetters = TaskUtils.countDigits(currentLine);
//            final int countLowerCaseLetters = TaskUtils.countLowerCaseLetters(currentLine);
//            final int countUpperCaseLetters = TaskUtils.countUpperCaseLetters(currentLine);
//            int countChars = TaskUtils.countChars(currentLine);
//
//            System.out.println("Line:\n" + currentLine);
//            System.out.println("wordCount: " + wordCount);
//            System.out.println("reversedLine: " + reversedLine);
//            System.out.println("digitsCaseLetters: " + digitsCaseLetters);
//            System.out.println("countLowerCaseLetters: " + countLowerCaseLetters);
//            System.out.println("countUpperCaseLetters: " + countUpperCaseLetters);
//            System.out.println("countChars: " + countChars);
//
//        }


        char pointChar = '\u2022';
        System.out.println(pointChar + " " + "someString1");
        System.out.println(pointChar + " " + "someString2");
        System.out.println(pointChar + " " + "someString3");
    }

    private static String readLine() {
        return SCANNER.nextLine();
    }
}
