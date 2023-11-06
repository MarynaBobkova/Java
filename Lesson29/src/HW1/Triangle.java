package HW1;

public class Triangle extends Shape{
    double side1;
    double side2;
    double side3;
    double height;

    public Triangle(double side1, double side2, double side3, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double areaTriangle = side1 * height / 2;
        return areaTriangle;
    }

    @Override
    public double calcPerimeter() {
        double perimeterTriangle = side1 + side2 + side3;
        return perimeterTriangle;
    }

    @Override
    public String name() {
        return "Triangle";
    }
}
