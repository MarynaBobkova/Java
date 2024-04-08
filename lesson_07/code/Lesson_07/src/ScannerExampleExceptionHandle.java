import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */
public class ScannerExampleExceptionHandle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Проверяем, можно ли считать целое число
        if (scanner.hasNextInt()) {
            int intValue = scanner.nextInt();
            System.out.println("Вы ввели целое число: " + intValue);
        } else {
            System.out.println("Это не целое число.");
            // Обработка некорректного ввода, например, запрос повторного ввода.
        }

        scanner.nextLine();

        // Проверяем, можно ли считать число с плавающей точкой
        if (scanner.hasNextDouble()) {
            double doubleValue = scanner.nextDouble();
            System.out.println("Вы ввели число с плавающей точкой: " + doubleValue);
        } else {
            System.out.println("Это не число с плавающей точкой.");
            // Обработка некорректного ввода, если необходимо.
        }

        // Закрываем сканнер
        scanner.close();
    }
}
