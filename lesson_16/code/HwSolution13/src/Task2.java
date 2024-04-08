/**
 * @author Andrej Reutow
 * created on 25.09.2023
 * <p>
 * Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100. Реализуйте метод,
 * который получает на вход исходный массив и возвращает массив, содержащий только положительные числа из исходного массива.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 201) - 100;
        }

        printArray(arr);

        int[] positiveArr = filterPositive(arr);
        printArray(positiveArr);
    }

    public static int[] filterPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int i = arr[j];
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
