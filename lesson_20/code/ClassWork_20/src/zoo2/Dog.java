package zoo2;

public class Dog extends Animal {


    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    /**
     * Метод, который позволяет собаке вернуть мяч после его броска. Это типичное действие для собак.
     */
    void fetchBall() {
        System.out.println("Собака принесла мяч.");
    }

    /**
     * Метод, который представляет действие охраны дома. Собаки часто используются в качестве сторожевых животных.
     */
    void guardHouse() {
        System.out.println("Собака охраняет дом.");
    }
}
