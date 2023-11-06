public class BubbleSort {
    public static void main(String[] args) {
        int[] source = new int[] {1, -10, 9, 99, 189, -186};
        sort(source);

        for (int i = 0; i < source.length; i++) {
            System.out.println("Index: " + i + " value " + source [i]);

        }

    }
    public static void sort(int[] array) {
        for (int indexOut = 0; indexOut < array.length; indexOut++) {
            for (int indexIn = 0; indexIn < array.length - 1; indexIn++) {

                if(array[indexIn] > array[indexIn + 1]){
                    int temp = array[indexIn];
                    array[indexIn] = array[indexIn + 1];
                    array[indexIn + 1] = temp;
                }

            }

        }
    }
}
