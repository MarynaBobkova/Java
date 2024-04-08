package string;

import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 10.10.2023
 */

// левый ctrl + q - обращение к документации
public class StringTasks {

    public static void main(String[] args) {
        String helloWorldString = "Hello World";
        String helloWorldString2 = "Hello World";
        String helloWorldString3 = new String("Hello World");

        System.out.println(helloWorldString == helloWorldString2); // true
        System.out.println(helloWorldString2 == helloWorldString3); // false
        System.out.println(helloWorldString2.equals(helloWorldString3)); // true
        System.out.println(helloWorldString.equals(helloWorldString2)); // true

        helloWorldString2.length(); // 11
        helloWorldString3.length(); // 11

        // charAt(int index): Возвращает символ строки по указанному индексу.
        System.out.println("\ncharAt0(int index): Возвращает символ строки по указанному индексу.");
        char charAt0 = helloWorldString.charAt(0); // char 'H'
        System.out.println("Символ по индексy 0: " + (int) charAt0);

        char charLastChar = helloWorldString.charAt(helloWorldString.length() - 1); // char 'd'
        System.out.println("Последний символ в строке: " + charLastChar);
        iterateStringWithCharAt(helloWorldString);
        iterateStringCharArray(helloWorldString3);

        // helloWorldString.charAt(1000); // throw StringIndexOutOfBoundsException

        // substring(int beginIndex, int endIndex): Возвращает подстроку, начиная с beginIndex и заканчивая endIndex - 1.
        System.out.println("\nsubstring(int beginIndex, int endIndex): Возвращает подстроку, начиная с beginIndex и заканчивая endIndex - 1.");
        // "Hello World"
        String subsctrResultAtIndex6 = helloWorldString.substring(6); // возвращает подстроку от 6 индекса включительно до самого последнего
        System.out.println("Substring from index 6 " + subsctrResultAtIndex6); // ... World

        String subsctrResultFromIndex = helloWorldString.substring(2, 9); // возвращает подстроку от 3 индекса включительно до 9 не включительно
        System.out.println("Substring from index 6 " + subsctrResultFromIndex); // ... llo Wor

        System.out.println("\nНайти подстроку от символа до символа");
        System.out.println("результат 1: " + substringFromCharAToCharB(helloWorldString, 'o', 'r'));
        System.out.println("результат 2: " + substringFromCharAToCharB(helloWorldString, 'l', 'l')); // llo Worl

        System.out.println("\nindexOf(), lastIndexOf()");
        int fromInt = helloWorldString.indexOf('o');
        int toInt = helloWorldString.indexOf('r');
        int toIntLastIndex = helloWorldString.lastIndexOf('r');
        System.out.println("результат 3: " + helloWorldString.substring(fromInt, toInt + 1)); // o Wor

        fromInt = helloWorldString.indexOf('l');
        toInt = helloWorldString.lastIndexOf('l');
        System.out.println("результат 4: " + helloWorldString.substring(fromInt, toInt + 1)); // llo Worl

        System.out.println("\nreplace(char oldChar, char newChar)");
        // Hello World
        // He##o Wor#d
        System.out.println(helloWorldString.replace('l', '#'));

        System.out.println("\ntoLowerCase() и toUpperCase(): Возвращает новую строку, где все символы преобразованы к нижнему или верхнему регистру.");
        System.out.println("To upper case:" + "lowerCaseString".toUpperCase());
        System.out.println("To upper case:" + helloWorldString.toUpperCase());
        System.out.println("To upper case:" + new String("some str").toUpperCase());
        System.out.println("To upper case:" + "Hello я Андрей агент 007".toUpperCase());
        System.out.println("To lower case: " + "UPPER_CASE_STRING".toLowerCase());

        System.out.println("\ntrim(): Удаляет пробелы в начале и в конце строки");
        String email = " user@email.com";
        String emailToLogin = "user@email.com";
        System.out.println("Find user by email: " + emailToLogin.equals(email)); // false
        String trimEmail = email.trim();
        System.out.println("Find user by email: " + emailToLogin.equals(trimEmail)); // true

        System.out.println("###");
        String someStr = "\n\t Hello\n";
        System.out.println(someStr); // перенос строки, с новой строки с пробелом слово " Hello" и после опять перенос строки
        System.out.println(someStr.trim());
        System.out.println("###");

        System.out.println("Hi my name is \t Andrej");
        System.out.println("Hi my name is \t Andrej".trim());

        System.out.println("Hi my name is \n Andrej");
        System.out.println("Hi my name is \n Andrej".trim());
        System.out.println("Hi my name is \n Andrej".replace(" \n ", ""));
        System.out.println("Hi my name is \n Andrej".replace("Andrej", "Vasja"));
        System.out.println("Andrej Hi Andrej my name is \n Andrej Andrej".replace("Andrej", ""));
        System.out.println("Hi my name is \n Andrej".replace("\n Andrej", "Vasja"));

        Integer age = 40;
        Integer newAge = 18;
        System.out.println("i am 40 years old".replace(age.toString(), newAge.toString()));


        System.out.println("\nsplit(String regex): Разбивает строку на массив подстрок, используя регулярное выражение.");
        String name = "Dr. Vasja Pupkin";
        String name2 = "Vasja Pupkin";
        String title; // "Dr."
        String firstName; // "Vasja"
        String lastName; // "Pupkin"
        String[] strings = name2.split(" ");
        // name ->  {"Dr.", "Vasja", "Pupkin"}
        // name2 ->  {"Vasja", "Pupkin"}
        if (strings.length == 3) {
            title = strings[0];
            firstName = strings[1];
            lastName = strings[2];
        } else if (strings.length == 2) {
            title = null;
            firstName = strings[0];
            lastName = strings[1];
        } else if (strings.length == 1) {
            title = null;
            firstName = strings[0];
            lastName = null;
        } else {
            title = null;
            firstName = null;
            lastName = null;
        }
        System.out.println(Arrays.toString(strings));
        System.out.println("title " + title);
        System.out.println("firstName " + firstName);
        System.out.println("lastName " + lastName);

        System.out.println("split using ,");
        String csvFile = "Max;Pupkin;email@main.com";
        String[] csvLine = csvFile.split(";");
        System.out.println(Arrays.toString(csvLine));
    }

    // обрезать строку от символа до символа и вернуть результат
    static String substringFromCharAToCharB(String source, char from, char to) {
        String result = "";
        int fromInt = findIndexOfChar(source, from);
//        int toInt = findIndexOfChar(source, to);
        int toInt = findLastIndexOfChar(source, to);

        if (fromInt >= 0 && toInt >= 0) {
            return source.substring(fromInt, toInt + 1);
        }

        return result;

        // "Hello World"
        // char from = 'o'
        // char to = 'r'
        // результат: "o Wor"
    }

    private static int findIndexOfChar(String source, char target) {
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    private static int findLastIndexOfChar(String source, char target) {
        for (int i = source.length() - 1; i >= 0; i--) {
            if (source.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }


    /**
     * перебор строки и печать каждого символа в консоль с указанием самого символа и его индекса
     *
     * @param text строка для перебора
     */
    public static void iterateStringWithCharAt(String text) {
//        System.out.println("индекс: " + 0 + " символ: " + text.charAt(0));
//        System.out.println("индекс: " + 1 + " символ: " + text.charAt(1));
//        System.out.println("индекс: " + 2 + " символ: " + text.charAt(2));

        for (int i = 0; i < text.length(); i++) {
            System.out.println("индекс: " + i + " символ: " + text.charAt(i));
        }
    }

    // комметарий
    static void iterateStringCharArray(String text) {
        char[] charArray = text.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.println("индекс: " + i + " символ: " + charArray[i]);
        }
    }
}
