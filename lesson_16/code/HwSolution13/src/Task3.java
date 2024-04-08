/**
 * @author Andrej Reutow
 * created on 25.09.2023
 * <p>
 * Реализовать способ обмена значениями двух переменных целого типа, не используя третьей переменной.
 * В идеале написать метод swap(a, b).
 */
public class Task3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("До обмена: a = " + a + ", b = " + b);
        swap(a, b);
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("После обмена: a = " + a + ", b = " + b);
    }
}
