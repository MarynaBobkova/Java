package exsample3.entity;

/**
 * @author Andrej Reutow
 * created on 20.10.2023
 */
public class Dog extends Animal {

    private String brand;

    public Dog(String name, String color, String brand) {
        super(name, color);
        this.brand = brand;
    }

    // name
    // color
    // только у собаки brand
    public void makeSound() {
        System.out.println("Собачка  с именем " + name + " лает");
    }
}
