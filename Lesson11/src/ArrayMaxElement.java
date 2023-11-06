public class ArrayMaxElement {
    // Найти максимальный элемент в массиве

    public static void main(String[] args) {
        long[] longArray = {1, 2, 5, 8, 100, 9576, -1};
        printArray(longArray);
        for (int index = 0; index < longArray.length; index++) {
        }
    }
    public static void printArray(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " ,value: " + arr[i]);
        }
    }
}
