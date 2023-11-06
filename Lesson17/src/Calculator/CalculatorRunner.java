package Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);
        System.out.println(result); // 15

        long aLong = 1000L;
        long bLong = 1000L;
        result = calculator.add(aLong, bLong);
        System.out.println();

        calculator.add(aLong, b);

        double aDouble = 10.0;
        double bDouble = 12.0;

    }
}
