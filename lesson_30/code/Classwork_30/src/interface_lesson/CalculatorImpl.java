package interface_lesson;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public class CalculatorImpl implements CalculatorInterface {


    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
