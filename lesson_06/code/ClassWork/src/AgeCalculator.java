import java.util.Scanner;
//Задача 1: Калькулятор возраста с вводом
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным");
        } else if (age <= 12) {
            System.out.println("Ребенок");
        } else if (age <= 18) {
            System.out.println("Подросток");
        } else {
            System.out.println("Взрослый");
        }
    }
}
