package exsample3.entity;

/**
 * @author Andrej Reutow
 * created on 20.10.2023
 */
public class Animal {

    private final String color;
    protected String name;

    protected Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }
}
