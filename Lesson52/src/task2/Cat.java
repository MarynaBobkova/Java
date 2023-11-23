package task2;

public class Cat {
    private int age;
    private String color;

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Cat cat = (Cat) object;

        if (age != cat.age) return false;
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
