package animal;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!"); // указали поведение метода для класса Cat
    }

    /**
     * Метод, который позволяет кошке лазить по деревьям.
     */
    public void climbTree() {
        System.out.println("Кошка лазит по деревьям.");
    }

    /**
     * Метод, представляющий охотничьи навыки кошки.
     */
    public void hunt() {
        System.out.println("Кошка идет на охоту.");
    }
}
