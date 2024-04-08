package homework;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

    private static int counter;
    private static String[] players = {"Jack", "John", "Bob", "Ben", "Zack", "Greg", "Steve"};

    public static void main(String[] args) {

        Supplier<Integer> idGenerator = () -> ++counter;

        for (int i = 0; i < 5; i++) {
            System.out.println("Сгенерированный идентификатор - " + idGenerator.get());
        }

        Supplier<Integer> randomGenerator = () -> new Random().nextInt(11) + 10;

        for (int i = 0; i < 10; i++) {
            System.out.println("Случайное значение от 10 до 20 - " + randomGenerator.get());
        }

        Supplier<String> nameGenerator = () -> players[new Random().nextInt(players.length)];

        for (int i = 0; i < 5; i++) {
            System.out.println(nameGenerator.get() + ", it's your turn now!");
        }

        Supplier<Integer> supplier = () -> 7;
    }
}