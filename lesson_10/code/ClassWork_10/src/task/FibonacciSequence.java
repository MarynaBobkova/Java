package task;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Первые 11 членов последовательности Фибоначчи
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < 11; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
