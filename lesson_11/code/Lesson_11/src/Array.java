/**
 * @author Andrej Reutow
 * created on 19.09.2023
 */
public class Array {

    public static void main(String[] args) {
        String garage[] = new String[11];       // 0 ... 10
        int size = garage.length;
        //   System.out.println("Размер массива: " + size);
//        int intArry[] = new int[100];           // 0 ... 99
//        boolean booleanArry[] = new boolean[100];
//        double doubleArry[] = new double[100];
//        char charArry[] = new char[100];
//        LocalDate LocalDate[] = new LocalDate[1000];

        garage[5] = "B-AR 1555";
        garage[0] = "M-TT 2012";
        garage[10] = "WN-GG 777";
        garage[6] = "OS-BN 666";
        String carNumber = "S-WG 2012";
        garage[4] = carNumber;

        printArray(garage);
        System.out.println();

        int parkNumber = 5;
        garage[parkNumber] = carNumber;


        int requestParkNumber = 2;
        String result = garage[requestParkNumber];
        // System.out.println(result); // null

        // System.out.println(garage[0]);

        printArray(garage);
    }

    // печать массива
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("На парковочном месте: " + i + " находится машина: " + arr[i]);
        }
    }
}
