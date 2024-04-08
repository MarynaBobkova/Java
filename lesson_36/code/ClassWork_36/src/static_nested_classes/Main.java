package static_nested_classes;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
public class Main {

    public static void main(String[] args) {
        int sum = Calculator.Operation.add(5, 3);
        int difference = Calculator.Operation.subtract(10, 3);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
