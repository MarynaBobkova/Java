package solution;
//Напишите программу, которая принимает два числа и операцию, а затем выполняет эту операцию
public class Calculator {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        char operator = '+';

        double result = performOperation(num1, num2, operator);

        System.out.println("Результат операции: " + num1 + " " + operator + " " + num2 + " = " + result);
    }

    // Метод для выполнения арифметических операций
    public static double performOperation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; // Возвращаем NaN в случае деления на ноль
                }
            default:
                return Double.NaN; // Возвращаем NaN для некорректной операции
        }
    }
}
