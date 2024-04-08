import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 20.09.2023
 */

// Программа должна проверять, все ли элементы в массиве уникальны.
public class Task5 {

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 1000, 100, 60};

        boolean isUniq = isUnique(source);
        System.out.println("Массив: " + Arrays.toString(source) + (isUniq ? " уникальный" : " не уникальный"));
    }

    public static boolean isUnique(int[] arr) {
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int currentInnerLoopValue = arr[j];
                if (currentValue == arr[j]) {
                    result = false;
                }
            }

        }

        return result;
    }
}
