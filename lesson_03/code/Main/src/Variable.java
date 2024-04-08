
/*
Числовые:
Целочисленные:
byte от -128 до +127
short
int
long
C дробной частью (3,14; 1,23145687)
double - 3.14, 0.7, .7
float - 3.14, 0.7, .7
Символьные
char - хранит 1 символ 'a'; 'b', 'h'; '1'
не примитивный
String - хранить строку. "a b c", "Hello world", "9.89"
Логический
boolean = true/false (0/1)
 */


public class Variable {

    public static void main(String[] args) {
        /*
        // объявление переменной
        byte thisIsByte;
        // присвоение
        thisIsByte = 5;

        byte thisIsByteVTwo = 30;
        short s = 300;
        int i = 5000;
        long l = 80000;

        int maxInt = 2147483647;
        long longNumber = 2147483648L;

        System.out.println(thisIsByte);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println(300);

        double d = 4.35;
        float f = 8.8987F;

        System.out.println(d);
        System.out.println(f);

        char charA = 'A';
        char charUnknown = 1256;

        System.out.println(charA);
        System.out.println(charUnknown);

        String name = "Herr Vasja";

        System.out.println("Herr Vasja");
        System.out.println("Herr Vasja");

        System.out.println(name);
        System.out.println(name);
        */

        math();
    }

    public static void math() {
        byte a = 120;
        int x = 10;
        int y = 5;

        int result = x + y; // 10 + 5 = 15;
        System.out.println(result);

        result = x - y; // 10 - 5 = 5;
        System.out.println(result);

        result = x / y; // 10 : 5 = 2;
        System.out.println(result);

        result = 0;
        System.out.println(result);

        result = x % y; // 10 % 5
        System.out.println(result); // 0

        result = 9 % 2;
        // 9 / 2 = 4,5
        // 4 * 2 = 8; = 1
        System.out.println(result); // 1


        result = 10 % 2;
        System.out.println(result); // 0

        result = 9 % 2;
        System.out.println(result); // 1

        result = 10 % 4;
        // 10 / 4 = 2,5;
        // 2 * 4 = 8;
        // 10 - 8 = 2;

        System.out.println(result); // 2
    }
}
