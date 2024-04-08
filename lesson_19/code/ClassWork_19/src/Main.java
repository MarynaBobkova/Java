/**
 * @author Andrej Reutow
 * created on 29.09.2023
 */
public class Main {

    public static void main(String[] args) {
        add(1,1);

        add("a", "b");
    };


    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b;
    }

    public static int add(double a, int b) {
        return (int) a + b;
    }

    public static int add(int a, double b) {
        return a + (int) b;
    }

    public static String add(String a, String b) {
        return a + b;
    }
}
