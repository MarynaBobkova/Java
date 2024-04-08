package calculator;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class CalculatorApp {

    public static void main(String[] args) {
        System.out.println(Calculator.add(1, 2));       // 3
        System.out.println(Calculator.subtract(1, 3)); // -2
        System.out.println(Calculator.multiply(2, 3)); // 6

        System.out.println(Calculator.circleArea(6)); //
    }
}
