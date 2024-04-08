/**
 * @author Andrej Reutow
 * created on 17.09.2023
 */
public class Test {
    public static void main(String[] args) {
        int number = 1;
        do {
            if (number % 5 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 100);
    }
}
