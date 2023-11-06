package Figure;

public class Shape {
    protected int area;
    protected int perimeter;
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
