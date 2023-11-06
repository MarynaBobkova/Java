/* Реализовать способ обмена значениями двух переменных целого типа,
не используя третьей переменной.
В идеале написать метод swap(a, b).
 */

public class Task3Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;

       a = a + b;
       b = a - b;
       a = a - b;
        System.out.println(a);
        System.out.println(b);

    }
}
