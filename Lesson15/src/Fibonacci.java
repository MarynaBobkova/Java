import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        long[] source = new long[n];
        generate(source);
        System.out.println(Arrays.toString(source));
    }
    public static void generate(long[] array) {
        array[0] = 0;
        array[1] = 1;

//        array[2] = array[0] + array[1]; //1
//        array[3] = array[1] + array[2]; //2
//        array[4] = array[2] + array[3]; //3

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];

        }
    }
}
