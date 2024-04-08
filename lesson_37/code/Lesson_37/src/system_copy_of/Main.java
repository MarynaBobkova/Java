package system_copy_of;

import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */
public class Main {

    public static void main(String[] args) {
        int[] source = {1, 2, -3, 4, -5};
        int[] target = new int[source.length * 2];

        System.arraycopy(source, 0, target, 0, source.length);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(target));
        System.out.println();

        target = new int[source.length * 2];
        System.arraycopy(source, 0, target, 2, source.length);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(target));
        System.out.println();

        target = new int[source.length * 2];
        System.arraycopy(source, 0, target, 2, 1);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(target));
        System.out.println();


        target = new int[source.length * 2];
        System.arraycopy(source, 3, target, 4, 2);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(target));
        System.out.println();


        target = new int[source.length * 2];
        System.arraycopy(source, 3, target, 4, source.length);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(target));
        System.out.println();
    }

    public static void copySystem(int[] src, int srcPos, int[] dest, int destPos, int length) {
        //  source1, srcPos = 2, target1, destPos = 2, length = 3
        // i = 2, j = 2, length = 3

        // i - индекс исходного массива (i равен srcPos, srcPos - начальный индекс исходного массива для копирования)
        // j - индекс целевого массива (j равен destPos, destPos - начальный индекс целевого массива, куда нужно установит первый элемент)
        // с - счетчик количества элементов для копирования

        for (int i = srcPos, j = destPos, c = 0; c < length; i++, j++, c++) {
            dest[j] = src[i];
        }
    }
}
