import java.util.Scanner;
//Задача 2: Определение сезона с вводом
public class SeasonIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Недопустимый номер месяца");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Зима");
        }
    }
}
