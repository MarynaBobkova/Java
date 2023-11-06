// 1. нужны участники (Person) - определить его поля
public class Person {

    private int id;
    private String name;
    // 5.1 при необходимости нужно добавить в класс Person поле которое хранит сколько пиц съел участник
    private int pizzaSlices;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void eatSlice() {
        this.pizzaSlices++;
    }

    public void sayResult() {
        System.out.println("I'm " + this.name + ", I eat " + this.pizzaSlices + " slices");
    }

    public int getPizzaSlices() {
        return pizzaSlices;
    }

    // 5.2
    public void setPizzaSlices(int pizzaSlices) {
        this.pizzaSlices = pizzaSlices;
    }
}