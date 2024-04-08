/**
 * @author Andrej Reutow
 * created on 19.09.2023
 */
public class SymmetricalArray {

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 2, 1};

        boolean result = isSymmetricalV1(array);
        // boolean result = isSymmetricalV2(array);

        // Output
        if (result) {
            System.out.println("The array is symmetrical.");
        } else {
            System.out.println("The array is not symmetrical.");
        }
    }

    public static boolean isSymmetricalV1(int[] array) {
        boolean isSymmetrical = true;
        int arrLength = array.length;

        for (int i = 0; i < arrLength / 2; i++) {
            if (array[i] != array[arrLength - i - 1]) {
                isSymmetrical = false;
            }
//            isSymmetrical = array[i] != array[arrLength - i - 1];
        }
        return isSymmetrical;
    }

    public static boolean isSymmetricalV2(int[] array) {
        boolean isSymmetrical = true;
        int arrLength = array.length;

        for (int i = 0, j = arrLength - 1; i < arrLength / 2; i++, j--) {
//            if (array[i] != array[j]) {
//                isSymmetrical = false;
//            }
            isSymmetrical = array[i] != array[j];
        }
        return isSymmetrical;
    }
}
