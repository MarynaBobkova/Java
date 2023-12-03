package task_4;

import java.io.Serializable;
import java.util.Objects;

public class Cat implements Serializable {
    private int age;
    private String color;
    private double weigt;

    public Cat(int age, String color, double weigt) {
        this.age = age;
        this.color = color;
        this.weigt = weigt;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeigt() {
        return weigt;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Cat cat = (Cat) object;

        if (age != cat.age) return false;
        if (Double.compare(weigt, cat.weigt) != 0) return false;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(weigt);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return String.format("Cat: age - %d, color - %s, weight - %.2f", age, color, weigt);
    }
}
