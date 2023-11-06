import java.util.Arrays;

/* Определить закономерность, согласно которой формируется та или иная числовая
последовательность. Написать методы, которые формируют первые N элементов данной
последовательности в виде целочисленного массива и выводит элементы массива на экран.
Дано:
последовательность 1: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
последовательность 2: 0, 0, 2, 0, 4, 0, 6, 0, 8, 0
последовательность 3: 0, 2, 0, 6, 0, 10, 0, 14, 0, 18
*/
public class Task1 {
    public static void main(String[] args) {
        int arrayLenght = 10;

        int [] array = new  int [arrayLenght];
        sequence(array);
        System.out.println(Arrays.toString(array));

        sequence2(array);
        System.out.println(Arrays.toString(array));;

        sequence3(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sequence(int[] array) {
        array[0] = 2;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 2;
        }
    }

    public static void sequence2 (int[] array) {
        array [0] = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            } else {
                array[i] = i;
            }
        }
    }

    public static void sequence3(int[] array) {
        array[0] = 0;
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 2 * i;
            }
        }
    }
}
