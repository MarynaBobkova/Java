/**
 * @author Andrej Reutow
 * created on 17.09.2023
 */

/*
С помощью цикла while написать программу, выводящую на экран результат умножения данного числа n на все целые числа от 0
до n
 */
public class Hw09Task4 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Куб числа " + counter + " = " + counter * counter * counter);
            counter++;
        }
    }
}
