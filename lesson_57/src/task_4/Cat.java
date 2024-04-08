package task_4;

import java.io.Serializable;
import java.util.Objects;

public class Cat implements Serializable {

    private int age;
    private String color;
    private double weight;

    public Cat(int age, String color, double weight) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, weight);
    }

    // Кот: возраст - 3, цвет - чёрный, вес - 4.56

    @Override
    public String toString() {
        return String.format("Кот: возраст - %d, цвет - %s, вес - %.2f.", age, color, weight);
    }
}