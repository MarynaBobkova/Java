/* Заменить каждый элемент массива с нечетным индексом на ноль.
Создайте массив из 8 случайных целых чисел из отрезка от -3 до 10
Выведите массив на экран в строку
Замените каждый элемент с нечётным индексом на ноль
Снова выведете массив на экран на отдельной строке
 */
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        int a = -3;
        int b = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            int remainder = i % 2;
            if (remainder != 0) {
                numbers[i] = 0;
            }
            System.out.print(numbers[i] + " ");
        }
    }
}
