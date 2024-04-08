/**
 * @author Andrej Reutow
 * created on 19.09.2023
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] ints = new int[5];
        ints[0] = 100;
        ints[1] = 5;
        ints[3] = 7;
        ints[4] = 8;

        // 100 + 5 + 0 + 7 + 8 = 120
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            result += ints[i]; // ints[0] = 1, ints[1] = 5, ints[2] = 5
        }

        System.out.println(result);
        printArray(ints);
    }

    // печать массива
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Интдекс: " + i + " значение: " + arr[i]);
        }
    }
}
