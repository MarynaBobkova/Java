import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 21.09.2023
 */
public class Main {
    public static void main(String[] args) {
        int arrayLength = 10;
        int[] array = new int[arrayLength];// длинна массива 10

//        sequence1(array);
//        System.out.println(Arrays.toString(array));
        sequence2(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sequence2(int[] array) {
        array[0] = 0;
        for (int i = 0; i < array.length - 1; i++) {

            if (i % 2 == 0) {
                array[i + 1] = array[i] + 2;
            } else {
                array[i + 1] = 0;
            }

        }
    }
}

