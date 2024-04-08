package hw;

/**
 * Задача 1: Проверка треугольника
 * Задача: Задать в программе три стороны треугольника.
 * Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше
 * суммы двух других.
 * Сообщить результат - существует или нет треугольник с заданными сторонами.
 */
public class TriangleCheck {
    public static void main(String[] args) {
        double sideA = 4.0;
        double sideB = 5.0;
        double sideC = 7.0;

        String result = checkTriangle(sideA, sideB, sideC);

        System.out.println(result);
    }

    // Метод для проверки неравенства треугольника
    public static String checkTriangle(double a, double b, double c) {
        if (a < b + c && b < a + c && c < a + b) {
            return "Треугольник существует.";
        } else {
            return "Треугольник не существует.";
        }
    }
}


