/**
 * @author Andrej Reutow
 * created on 21.09.2023
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] source = new int[]{5, -10, 9, 99, 189, -186};

        sort(source);

        for (int i = 0; i < source.length; i++) {
            System.out.println("Index: " + i + " value " + source[i]);
        }
    }
//6 30
//5 25
//5 15


    public static void sort(int[] array) {

        int innerCounter = 0;
        int outerCounter = 0;

        for (int indexOut = 0; indexOut < array.length - 1; indexOut++) { // внешний цикл
            // if (arr[0] > arr[1]) { int temp = arr[0]; arr[0] = arr[1]; arr[1] = temp; } // [1, 3, 2, 6, 4, 5]
            for (int indexIn = 0; indexIn < array.length - 1 - indexOut; indexIn++) {
                if (array[indexIn] > array[indexIn + 1]) {
                    int temp = array[indexIn];                  // сохраняю правый элемент (больший)
                    array[indexIn] = array[indexIn + 1];        // перемещаю правый элемент в лево
                    array[indexIn + 1] = temp;
                }
                innerCounter++;
            }
            outerCounter++;
        }

        System.out.println("outerCounter " + outerCounter);
        System.out.println("innerCounter " + innerCounter);
    }
}
