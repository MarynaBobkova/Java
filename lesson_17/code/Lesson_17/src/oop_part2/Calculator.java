package oop_part2;

/**
 * @author Andrej Reutow
 * created on 27.09.2023
 */
public class Calculator {

    public int addNumbers(int a, int b) {
        System.out.println("int + int");
        return a + b;
    }
    // overload - перегрузка методов
    public int addNumbers(long a, int b) {
        System.out.println("long + int");
        return (int) (a + b);
    }

    public int addNumbers(int a, long b) {
        System.out.println("int + long");
        return (int) (a + b);
    }

    public int addNumbers(long a, long b) {
        System.out.println("long + long");
        return (int) (a + b);
    }

    public int addNumbers(double a, double b) {
        System.out.println("double + double");
        return (int) (a + b);
    }

    public int addNumbers(short a, short b) {
        return (int) (a + b);
    }

    public int addNumbers(byte a, byte b) {
        return (int) (a + b);
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
