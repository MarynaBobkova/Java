/**
 * @author Andrej Reutow
 * created on 17.09.2023
 */
public class Test {
    public static void main(String[] args) {
        int number = Short.MAX_VALUE;
        short result = (short) number;

        System.out.println(++number);
        System.out.println(++result);
    }
}
