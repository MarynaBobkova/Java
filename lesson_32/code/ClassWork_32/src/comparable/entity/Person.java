package comparable.entity;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Сравнение объектов происходит по одному их из полей. В нашем примере по полю age
        // если текущий объект больше other то вернуть положительное число
        // если текущий объект меньше other то вернуть отрицательное число
        // если объект равны то вернуть 0
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
