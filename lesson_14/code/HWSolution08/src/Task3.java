public class Task3 {
    public static void main(String[] args) {
        System.out.println("#3");
        int[] arr = {15, 11, 22, 23, 58, 10, 47, 65, 98, 78};
        printArray(arr);
        bubleShortUp(arr);
        bubleShortDown(arr);
    }

    public static void bubleShortUp(int[] arr) {
        int storage = 0;
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    storage = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = storage;
                }
            }
        }
        printArray(arr);
    }

    public static void bubleShortDown(int[] arr) {
        int storage = 0;
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    storage = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = storage;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
