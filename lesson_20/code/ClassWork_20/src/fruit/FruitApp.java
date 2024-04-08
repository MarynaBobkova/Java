package fruit;

public class FruitApp {
    public static void main(String[] args) {
        Fruit fruit1 = new Apple();
        Fruit fruit2 = new Banana();

        fruit1.eat(); // Вызывает метод eat() класса Apple
        fruit2.eat(); // Вызывает метод eat() класса Banana
    }
}
