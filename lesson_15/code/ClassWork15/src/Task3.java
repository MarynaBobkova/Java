import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 25.09.2023
 */
//Задача 3: Генерация и вывод первых N чисел Фибоначчи
public class Task3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArr = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArr[uniqueCount++] = arr[i];
            }
        }

        uniqueArr = Arrays.copyOf(uniqueArr, uniqueCount);

        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}
