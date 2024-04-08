package hw13;

/**
 * @author Andrej Reutow
 * created on 26.09.2023
 * С помощью вложенного цикла For (цикл в цикле) написать метод, выводящий на экран треугольник такого вида:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 */
public class Task5 {

    public static void main(String[] args) {
        int n = 6; // Количество строк треугольника
        printTriangle(n);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
