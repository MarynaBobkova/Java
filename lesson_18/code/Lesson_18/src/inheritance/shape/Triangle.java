package inheritance.shape;

/**
 * @author Andrej Reutow
 * created on 28.09.2023
 */
public class Triangle extends Shape {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Расчет периметра в классе Triangle");
        return sideA + sideB + sideC;
    }
}
