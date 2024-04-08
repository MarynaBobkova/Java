package dog;

import animal.Animal;

/**
 * @author Andrej Reutow
 * created on 06.10.2023
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }
}
