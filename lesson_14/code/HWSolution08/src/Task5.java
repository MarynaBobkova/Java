public class Task5 {
        public static void main(String[] args) {
            System.out.println("#5");
            int[] arr = {15, 101, 58, 1, 98, 70};
            int[] arr1 = {1, -10, 70, 101};
            printArray(arr);
            search(arr, arr1);
        }

        public static void search(int[] a1, int[] a2) {
            for (int i = 0; i < a1.length; i++) {
                for (int j = i; j < a2.length; j++) {
                    if (a1[i] == a2[j]) {
                        System.out.println("Число " + a1[i] + ", найдено, индекс " + i);
                    }
                    else {
                        System.out.println("Число " + a1[i] + " индекс не найдено");
                    }
                }
            }
        }


        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
}
