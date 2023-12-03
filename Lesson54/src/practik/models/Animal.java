package practik.models;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public abstract class Animal implements Comparable<Animal>{
    private static long entityCounter = 0;
    protected long id;
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

        entityCounter++;
        this.id = entityCounter;
    }

    abstract public void eat();
    public long getId(){
        return id;
    }

    @Override
    public int compareTo(@NotNull Animal o) {
        return Integer.compare(age, o.age);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Animal animal = (Animal) object;

        if (id != animal.id) return false;
        if (age != animal.age) return false;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
