/**
 * @author Andrej Reutow
 * created on 17.09.2023
 */

/*
С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n
 */
public class Hw09Task3 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Куб числа " + counter + " = " + counter * counter * counter);
            counter++;
        }
    }
}
