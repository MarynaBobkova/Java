/**
 * @author Andrej Reutow
 * created on 17.09.2023
 */

/*
Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
 */
public class Hw09Task2 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter <= 100) {
            if (counter % 5 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
