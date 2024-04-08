package animal2;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Animal {

    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Животное издает звук, не понятно какой именно!");
    }

    /**
     * Выводит данные животного
     *
     * @return Выводит данные животного
     */
    public String getDetails() {
        String result = "Name: " + this.name + " color: " + this.color;
        return result;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }
}
