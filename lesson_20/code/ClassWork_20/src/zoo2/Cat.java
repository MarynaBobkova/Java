package zoo2;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }

    /**
     * Метод, который позволяет кошке лазить по деревьям. Это типичное действие для кошек.
     */
    public void climbTree() {
        System.out.println("Кошка лазит по деревьям.");
    }

    /**
     * Метод, представляющий охотничьи навыки кошки. Кошки часто охотятся на мелких животных.
     */
    public void hunt() {
        System.out.println("Кошка идет на охоту.");
    }
}
