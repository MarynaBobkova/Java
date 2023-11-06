package HW1;
//Добавьте в массив три круга, два треугольника и один квадрат.
//Выведи на печать площадь и периметр для каждой фигуры
//Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class FigureAppl {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(1);
        Circle circle3 = new Circle(2.5);

        Triangle triangle1 = new Triangle(1,1,1,0.5);
        Triangle triangle2 = new Triangle(3,5,1,2);

        Square square1 = new Square(3);


        double totalSquare = 0;
        double totalPerimetr = 0;

        Shape[] shapes = {circle1, circle2, circle3, triangle1, triangle2, square1};
        for (int i = 0; i < shapes.length; i++) {
            totalSquare += shapes[i].calcArea();
            totalPerimetr += shapes[i].calcPerimeter();

            System.out.println("Площадь: " +  shapes[i].name() + " " + shapes[i].calcArea());
            System.out.println("Периметр: " + shapes[i].name() + " " + shapes[i].calcPerimeter());
            System.out.println("-".repeat(40));
        }
        System.out.println("Общий периметр: " + totalPerimetr);
        System.out.println("-".repeat(40));
        System.out.println("Общая площаль: " + totalSquare);
        System.out.println("-".repeat(40));


    }
}
