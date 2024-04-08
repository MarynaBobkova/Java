package animal;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Dog extends Animal {

    @Override // переопределили метод супер класса
    public void makeSound() { // переопределили метод супер класса
        System.out.println("Гав-гав!");  // указали поведение метода для класса Dog
    }

    /**
     * Метод, который позволяет собаке вернуть мяч после его броска
     */
    public void fetchBall() {
        System.out.println("Собака принесла мяч");
    }

    /**
     * Метод, который представляет действие охраны дома
     */
    public void guardHouse() {
        System.out.println("Собака охраняет дом");
    }
}
