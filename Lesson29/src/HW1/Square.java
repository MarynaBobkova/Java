package HW1;

public class Square extends Shape{
    double side;

    public Square(double a) {
        this.side = a;
    }

    @Override
    public double calcArea() {
        double areaSquare = side * side;
        return areaSquare;
    }

    @Override
    public double calcPerimeter() {
        double perimeterSquare = 4* side;
        return  perimeterSquare;
    }

    @Override
    public String name() {
        return "Square";
    }
}
