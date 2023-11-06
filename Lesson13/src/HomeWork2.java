/* Напишите программу, которая находит n-ное вхождение заданного числа в отсортированном массиве.
 Если число не найдено, программа должна вернуть -1.
Пример:
Вход: Массив [1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19] и число 3 с номером вхождения 2.
Выход: Индекс 2, поскольку второе вхождение числа 3 находится на этой позиции.
 */
public class HomeWork2 {
    public static void main(String[] args) {
        int [] array = {1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19};
        int number = 3;
        int numberSequence = 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                if(array[i+numberSequence-1] == number) {
                    System.out.println(i + numberSequence - 1);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
