package Figure;

public class Triangle extends Shape {
    private int sideA;
    private  int sideB;
    private  int sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
