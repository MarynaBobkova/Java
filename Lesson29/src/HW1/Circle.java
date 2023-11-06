package HW1;

public class Circle extends Shape{
double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        double areaCircle = Math.PI * radius * radius;
                return areaCircle;
    }

    @Override
    public double calcPerimeter() {
        double perimetrCircle = 2 * Math.PI * radius;
        return perimetrCircle;
    }

    @Override
    public String name() {
        return "Circle";
    }
}
