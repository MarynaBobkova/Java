package consultation;

/**
 * @author Andrej Reutow
 * created on 23.10.2023
 */
public class Person {

    private String name;
    private int age;
    private int zipCode;

    public Person(String name, int age, int zipCode) {
        this.name = name;
        this.age = age;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", zipCode=" + zipCode +
                '}';
    }
}
