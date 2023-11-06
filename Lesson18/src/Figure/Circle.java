package Figure;

public class Circle extends Shape {
    private int radius;
    public  Circle (String name, int radius) {
        super(name);
        this.radius = radius;
    }
    public Circle(int radius) {
        super();
        this.radius = radius;
    }
    public void getAreaCircle() {
        super.getArea();
    }
    public int getArea() {
        return -1;
    }

}
