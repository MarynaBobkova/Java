package task2;

public class Dog {
    private int age;
    private String color;

    public Dog(int age, String color) {
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

        Dog dog = (Dog) object;

        if (age != dog.age) return false;
        return color.equals(dog.color);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
