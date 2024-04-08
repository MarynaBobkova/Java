import java.util.Scanner;

// Задача 1: Калькулятор с вводом
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Деление на ноль недопустимо");
                    return;
                }
                break;
            default:
                System.out.println("Недопустимая операция");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
