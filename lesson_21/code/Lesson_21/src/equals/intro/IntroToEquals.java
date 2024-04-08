package equals.intro;

import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 04.10.2023
 */
public class IntroToEquals {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

        System.out.println(a == b); // true
        System.out.println(b == a); // true

        System.out.println(a == c); // true
        System.out.println(c == a); // true

        System.out.println(c == b); // true

        String str1 = "Hello"; // str1 ссылка - @713, значение "Hello" записанно в String pool
        String str2 = "Hello"; // str2 ссылка - @713, т.к. в String pool уже есть значение "Hello"

        System.out.println(str1 == str2); //true @713 == @713

        String str3 = new String("Hello"); // создаю новый объект (ключевое слово new), c новой другой ссылкой. str3 = @714

        System.out.println(str1 == str3); // false // str1 ссылка - @713 , str3 @714, @713 == @714
        System.out.println(str2 == str3); // false // str2 ссылка - @713 , str3 @714, @713 == @714

//        System.out.println(str1.equals(str2)); // true
//        System.out.println(str1.equals(str3)); // true
//        System.out.println(str2.equals(str3)); // true


        Object someObject = getSomeObject();
//        System.out.println(someObject.equals(str3)); // false - т.к. это разные объекты
        System.out.println(str3.equals(someObject)); // true
        System.out.println(str3 == someObject); // false - т.к. это ссылки различные
    }

    public static Object getSomeObject() {
        return new Scanner(System.in);
    }

//    public static Object getSomeObject() {
//        return new String("Hello");
//    }
}
