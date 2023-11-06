public class ArraySum {
    public static void main(String[] args) {
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 5;
        ints[2] = 100;
        ints[3] = 7;
        ints[4] = 8;

        //1 + 5 + 100 + 7 + 8 =
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            result += ints[0]; //ints[0] = 1, ints[1] = 5;
        }
        System.out.println(result);
        printArray(ints);
    }

    //печать массива
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: " + i + " value: " + arr[i]);
        }
    }
}
