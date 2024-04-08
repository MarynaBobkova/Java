package binary_search;

import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */
public class SimpleBS {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        int resultBy3 = Arrays.binarySearch(ints, 3);
        System.out.println(resultBy3); // 2

        int[] unsortedInts = {2, 1, 3, 5, 7, 6};
        Arrays.sort(unsortedInts);
        System.out.println(Arrays.toString(unsortedInts));
        int resultBy7 = Arrays.binarySearch(unsortedInts, 7);
        System.out.println(resultBy7);


        System.out.println("\nString binary search:");
        String[] lines = {"abc", "zzz", "aaa"};
        Arrays.sort(lines);
        System.out.println(Arrays.toString(lines));
        int resultByAaa = Arrays.binarySearch(lines, "zzz");
        System.out.println(resultByAaa);
    }
}
