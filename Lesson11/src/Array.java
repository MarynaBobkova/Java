public class Array {

    public static void main(String[] args) {
        String garage[] = new String[11]; // 0....10

        garage[5] = "B-AR 1555";
        garage[0] = "M-TT 2012";
        garage[10] = "WN-GG 777";
        garage[6] = "OS-BN 666";

        String carNumber = "S-WG 2012";
        garage[4] = carNumber;

        int parkNumer = 5;
        garage[parkNumer] = null;

        int requestParkNumber = 2;
        String result = garage [requestParkNumber];
        System.out.println(result);

        System.out.println(garage[0]);

        printArrav(garage);
    }
    public static void printArrav(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("In a parking space " + i + " the car is located: " + arr[i]);
        }
    }
}

