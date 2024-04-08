import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class MyApp {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));
        if (args.length > 0) {
            System.out.println(args[0]);
        }
        if (args.length > 2) {
            System.out.println(args[1]);
        }

        System.out.println("Hello world!");
    }
}
