package string;

/**
 * @author Andrej Reutow
 * created on 09.10.2023
 */
public class StringApp {

    public static void main(String[] args) {
        String str1 = "Hello";
        char[] str1AsChar = {'H', 'e', 'l', 'l', 'o'};

        System.out.println("String length " + str1.length()); // узначть длинну строки
        System.out.println("chars length:" + str1AsChar.length);

        String str2 = "\n\n\n\n";
        System.out.println(str2.length()); // 4

        String str3 = new String(str1AsChar);

        System.out.println(str1.equals(str3)); // true

        char[] str3CharArray = str3.toCharArray();
        System.out.println();

        // Hello olleH
        String str4 = StringTasks.reverse(str1); // olleH
        System.out.println(str4); // olleH

        String str5 = str4.toUpperCase();
        String str6 = str4.toLowerCase();

        System.out.println(str4); // olleH
        System.out.println(str5); // OLLEH
        System.out.println(str6); // olleh

        System.out.println(str4.toUpperCase());
    }
}
