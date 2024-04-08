/**
 * @author Andrej Reutow
 * created on 25.09.2023
 */
import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 25.09.2023
 */
// Задача 2: Клонирование массива с использованием циклов for и while
public class Task2 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Клонирование с использованием цикла for
        int[] clonedArrayFor = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            clonedArrayFor[i] = originalArray[i];
        }

        // Вывод клонированного массива с использованием цикла for
        System.out.print("Клонированный массив (for): ");
        for (int num : clonedArrayFor) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Клонирование с использованием цикла while
        int[] clonedArrayWhile = new int[originalArray.length];
        int i = 0;
        while (i < originalArray.length) {
            clonedArrayWhile[i] = originalArray[i];
            i++;
        }

        // Вывод клонированного массива с использованием цикла while
        System.out.print("Клонированный массив (while): ");
        for (int num : clonedArrayWhile) {
            System.out.print(num + " ");
        }
    }
}

