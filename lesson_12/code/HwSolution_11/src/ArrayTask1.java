/**
 * @author Andrej Reutow
 * created on 19.09.2023
 * <p>
 * Создайте массив из 12 случайных целых чисел из отрезка от `-15` до `15`. Определите какой элемент является в этом
 * массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */
public class ArrayTask1 {

    public static void main(String[] args) {
        int[] mas = {15, -1, 5, 8, 10, -13, -9, 8, 7, 10, -2,  -3};
        int maxIndex = 0;
//        int maxNumber = mas[0];
        int maxNumber = mas[maxIndex]; // 15

        for (int i = 0; i < mas.length; i++) {
            if (maxNumber <= mas[i]) {  // i = 0, maxNumber = 15, mas[i] = -1 (15 <= 15)
                                        // i = 1, maxNumber = 15, mas[i] = -1 (15 <= -1)
                                        // i = 2, maxNumber = 15, mas[i] = 5 (15 <= 5)
                maxNumber = mas[i];
                maxIndex = i;
            }
        }

        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}
