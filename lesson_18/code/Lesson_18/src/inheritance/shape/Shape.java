package inheritance.shape;

/**
 * @author Andrej Reutow
 * created on 28.09.2023
 */

/*
Рассмотрим иерархию классов для геометрических фигур.
У нас есть суперкласс "Фигура", который содержит общие свойства, такие как площадь и периметр.
 Из этого суперкласса мы создаем подклассы: "Круг", "Прямоугольник" и "Треугольник".
  Каждый подкласс имеет свои уникальные свойства и методы, но наследует общие характеристики от суперкласса.
 */
public class Shape { // суперкласс

    protected int area;
    private int perimeter;
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public double calculatePerimeter() {
        System.out.println("Расчет периметра в классе Shape");
        return -1;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
