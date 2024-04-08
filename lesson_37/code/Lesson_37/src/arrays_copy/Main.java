package arrays_copy;

import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */
public class Main {

    public static void main(String[] args) {
        int[] source1 = {1, 2, -3, 4, -5};

//        int[] result = Arrays.copyOfRange(source1, 3, source1.length);
//        System.out.println(source1.length);
//        System.out.println(result.length);
//        System.out.println(Arrays.toString(result));
//        System.out.println();
//
//        result = Arrays.copyOfRange(source1, 2, 3);
//        System.out.println(source1.length);
//        System.out.println(result.length);
//        System.out.println(Arrays.toString(result));
//        System.out.println();
//
//        int[] result2 = Arrays.copyOf(source1, 10);
//        System.out.println(result2.length);
//        System.out.println(result.length);
//        System.out.println(Arrays.toString(result2));
//        System.out.println();
//
//        int[] result3 = Arrays.copyOf(source1, 2);
//        System.out.println(result3.length);
//        System.out.println(result.length);
//        System.out.println(Arrays.toString(result3));


        int[] resultRemove3 = removeElement2(source1, -5);
        System.out.println(Arrays.toString(resultRemove3));
    }

    public static int[] removeElement(int[] source, int key) {
        Arrays.sort(source);
        int keyIndex = Arrays.binarySearch(source, key);
        if (keyIndex >= 0) {
            int temp = source[source.length];
            source[keyIndex] = temp;
            int[] result = new int[source.length - 1];
            System.arraycopy(source, 0, result, 0, source.length - 1);
            return result;
        }
        return source;
    }


    public static int[] removeElement2(int[] source, int key) {
        int keyIndex = -1;
        for (int i = 0; i < source.length; i++) {
            if (key == source[i]) {
                keyIndex = i;
                break;
            }
        }

        if (keyIndex >= 0) {
            int[] result = new int[source.length - 1];
            System.arraycopy(source, 0, result, 0, keyIndex);
            System.arraycopy(source, keyIndex + 1, result, keyIndex, result.length - keyIndex);
            return result;
        }

        return source;
    }
}
