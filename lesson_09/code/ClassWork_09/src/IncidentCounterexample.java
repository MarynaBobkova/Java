/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */
public class IncidentCounterexample {

    public static void main(String[] args) {
        System.out.println("Инкремент");
        System.out.println("Постфиксный инкремент ++i");
        prefixIncrement();

        System.out.println("Префиксный инкремент ++i");
        postfixIncrement();

        System.out.println("декремент");
        System.out.println("Постфиксный инкремент --i");
        prefixDecrement();

        System.out.println("Постфиксный инкремент i--");
        postfixDecrement();

        int a = 10;
        System.out.println(++a); // 11
        System.out.println(a++); // 11 (+1) - a будет 11 при выводе, и после этой строки a станет 12.
        System.out.println(a);   // 12

        int counter = 0; // 0
        counter++;       // 0 (1)
        System.out.println(++counter); //2
    }

    public static void prefixIncrement() {
        int i = 5;
        int j = ++i; // i = 6, j = 6
        System.out.println(j); // 6
        System.out.println(i); // 6
    }

    public static void postfixIncrement() {
        int i = 5;
        int j = i++; // i = 5 (+1), j = 5
        System.out.println(j); // 5
        System.out.println(i); // 6
    }

    public static void prefixDecrement() {
        int i = 5;
        int j = --i; // i = 4, j = 4
        System.out.println(j); // 4
        System.out.println(i); // 4
    }

    public static void postfixDecrement() {
        int i = 5;
        int j = i--; // i = 5 (-1), j = 5
        System.out.println(j); // 5
        System.out.println(i); // 4
    }
}
