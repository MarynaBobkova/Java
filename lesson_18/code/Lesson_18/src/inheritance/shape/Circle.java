package inheritance.shape;

/**
 * @author Andrej Reutow
 * created on 28.09.2023
 */
public class Circle extends Shape {
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Расчет периметра в классе Circle");
        return (2 * 3.14) * radius;
    }

    public void getAreaCircle() {
        super.getArea();
    }

    public int getArea() {
        return -1;
    }
}
