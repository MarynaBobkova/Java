package solution;

/**
 * @author Andrej Reutow
 * created on 12.09.2023
 */

// Задача 1.
// Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
// Сообщить результат - существует или нет треугольник с заданными сторонами.
public class TriangleCheckWithConstant {

    static double sideA = 10;
    static double sideB = 2;
    static double sideC = 3;

    public static void main(String[] arguments) {
        String result = checkTriangle();
        System.out.println("Для сторон: " + sideA + " " + sideB + " " + sideC + " " + result); // 1,2,3 - не существует

        result = checkTriangle();
        System.out.println("Для сторон: 2 3 4 " + result);// 2,3,4 - существует
    }

    public static String checkTriangle() {
        String message;
        boolean isASideShort = sideA < (sideB + sideC);
        boolean isBSideShort = sideB < (sideA + sideC);

        if (isASideShort & isBSideShort & sideC < (sideB + sideA)) {
            message = "Треугольник существует";
        } else {
            message = "Треугольник не существует";
        }

        return message;
    }
}
