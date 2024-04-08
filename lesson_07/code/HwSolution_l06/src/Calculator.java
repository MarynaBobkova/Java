//Напишите программу, которая принимает два числа и операцию, а затем выполняет эту операцию
public class Calculator {
    public static void main(String[] args) {
        double result = performOperation(5, 5, '+');
        System.out.println("Рузультат: " + result); // 10

        result = performOperation(15, 5, '-');
        System.out.println("Рузультат: " + result); // 10


        result = performOperation(150, 100, 'A');
        System.out.println("Рузультат: " + result); // 0
    }

    // Метод для выполнения арифметических операций
    /*
    char operator = '+' '-' '*' ...
     */
    public static double performOperation(double num1,
                                          double num2,
                                          char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                result = 0;
        }

        return result;
    }
}
