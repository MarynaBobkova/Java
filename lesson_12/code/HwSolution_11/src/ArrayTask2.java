/**
 * @author Andrej Reutow
 * created on 19.09.2023
 * <br>
 * Заменить каждый элемент массива с нечетным индексом на ноль.
 * <p>
 * Создайте массив из 8 случайных целых чисел из отрезка от -3 до 10
 * Выведите массив на экран в строку
 * Замените каждый элемент с нечётным индексом на ноль
 * Снова выведете массив на экран на отдельной строке
 * </p>
 */
public class ArrayTask2 {

    public static void main(String[] args) {
        int[] mas = {-3, 5, 6, -1, 9, 8, 2, 4};
        printArray(mas);
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1) {
                mas[i] = 0;
            }
        }

        printArray(mas);
        System.out.println();

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
