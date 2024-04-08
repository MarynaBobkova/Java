package wrapper_char;

/**
 * @author Andrej Reutow
 * created on 10.10.2023
 */
public class CharTasksApp {

    public static void main(String[] args) {

        String testStr1 = "abcd123";
        System.out.println("String " + testStr1 + " has upper case letter(s): " + CharTasks.hasUpperCaseLetter(testStr1));

        String testStr2 = "abcd123A";
        System.out.println("String " + testStr2 + " has upper case letter(s): " + CharTasks.hasUpperCaseLetter(testStr2));

        String testStr3 = "A";
        System.out.println("String " + testStr3 + " has upper case letter(s): " + CharTasks.hasUpperCaseLetter(testStr3));

        String testStr4 = "a";
        System.out.println("String " + testStr4 + " has upper case letter(s): " + CharTasks.hasUpperCaseLetter(testStr4));

        printAllUpperCaseLetters();
    }


    public static void printAllUpperCaseLetters() {
//        for (char i = 'A'; i <= 'Z'; i++) {
//            System.out.println("code: "+ (int)i + ", symbol: " + i);
//        }

        for (int i = 65; i <= 'Z'; i++) { // i <= 'Z' -> i <= 90
            System.out.println("code: "+ i + ", symbol: " + (char)i);
        }
    }
}
