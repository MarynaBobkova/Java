package inheritance.shape;

import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 28.09.2023
 */
public class Main {

    public static void main(String[] args) {
//        Shape shape = new Shape("Фигура");
//        Circle circle = new Circle("Окружность", 10);
//        Triangle triangle = new Triangle("Треугольник", 5, 6, 7);
//
//        double perimeterShape = shape.calculatePerimeter();
//        double perimeterTriangle = triangle.calculatePerimeter();
//        double perimeterCircle = circle.calculatePerimeter();

        System.out.println();

        Shape circle = new Circle("Окружность", 10);
        Shape triangle = new Triangle("Треугольник", 5, 6, 7);

        circle.calculatePerimeter();
        triangle.calculatePerimeter();

        // downcasting объектов
        Circle circle1 = (Circle) circle; // низходящее преобразование перменной типа Shape в тип тип Circle
        circle1.getAreaCircle();

        // upcasting объектов
        Circle circle2 = new Circle("Окружность", 10);
        circle2.getAreaCircle();
        Shape circle3 = circle2;


        Circle circle4 = new Circle("Окружность", 10);
        Shape circle5 = circle4;
        if (circle5 instanceof Triangle) {
            Triangle triangle1 = (Triangle) circle5;
        }

        System.out.println(circle4 instanceof Circle);
        System.out.println(circle4 instanceof Shape);
        System.out.println(circle5 instanceof Shape);
        System.out.println(circle5 instanceof Triangle);

        System.out.println(circle5 instanceof Circle);
        System.out.println(circle5 instanceof Triangle);
        System.out.println(circle5 instanceof Shape);

        System.out.println(triangle instanceof Shape);
        System.out.println(triangle instanceof Triangle);
        System.out.println(triangle instanceof Circle);

        System.out.println(circle4 instanceof Object);
        System.out.println(circle1 instanceof Object);
        System.out.println(circle2 instanceof Object);
        System.out.println(circle3 instanceof Object);
        System.out.println(triangle instanceof Object);

    }
}
