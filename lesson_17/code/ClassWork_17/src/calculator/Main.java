package calculator;

/**
 * @author Andrej Reutow
 * created on 27.09.2023
 */
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 7);         // Вызывается метод add(int, int)
        double result2 = calculator.add(3.5, 2.5);  // Вызывается метод add(double, double)
    }

}


class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
