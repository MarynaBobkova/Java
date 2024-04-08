package animal;

/**
 * @author Andrej Reutow
 * created on 06.10.2023
 */
public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    final public void voice() {
        System.out.println("Some sound");
    }

    protected void eat() {
        System.out.println("Animal eating");
    }

    public String getName() {
        return name;
    }
}
