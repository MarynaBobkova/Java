package solution;

/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */

// Задача 1.
// Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
// Сообщить результат - существует или нет треугольник с заданными сторонами.
public class TriangleCheck {

    public static void main(String[] arguments) {
        double sideA = 10;
        double sideB = 2;
        double sideC = 3;

        String result = checkTriangle(sideA, sideB, sideC);
        System.out.println("Для сторон: " + sideA + " " + sideB + " " + sideC + " " + result); // 1,2,3 - не существует

        result = checkTriangle(2, 3, 4);
        System.out.println("Для сторон: 2 3 4 " + result);// 2,3,4 - существует
    }

    public static String checkTriangle(double a, double b, double c) {
        String message;
        boolean isASideShort = a < (b + c);
        boolean isBSideShort = b < (a + c);

        if (isASideShort & isBSideShort & c < (b + a)) {
            message = "Треугольник существует";
        } else {
            message = "Треугольник не существует";
        }

        return message;
    }
}
