package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    private static int counter;
    private static String[] players = {"Bob", "Mark", "John", "Mary", "Kate", "Vlad"};
    public static void main(String[] args) {
        Supplier<Integer> idGenerator = () -> ++counter;
        for (int i = 0; i < 5; i++) {
            System.out.println("Сгенерированный генератор - " + idGenerator.get());
        }
        Supplier<Integer> rendomGenerator = () -> new Random().nextInt(11) + 10;

        for (int i = 0; i < 10; i++) {
            System.out.println("Случайное значение от 10 до 20 - " + rendomGenerator.get());
        }
        Supplier<String> nameGenerator = () -> players[new  Random().nextInt(players.length)];
        for (int i = 0; i < 5; i++) {
            System.out.println(nameGenerator.get() + ", it's your turn now");
        }
    }
}
