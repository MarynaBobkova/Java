import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 20.09.2023
 */

//Пользователь вводит два числа: длину массива и число X.
//Программа заполняет массив случайными числами (число X может не оказаться в масcиве).
//Найти, сколько раз число X встречается в массиве.
public class Task4 {


    public static void main(String[] args) {
        // Пользователь вводит два числа: длину массива и число X.
        Scanner scanner = new Scanner(System.in); // ручка

        System.out.println("Введите размер массива? 0 - n");
        int arrayLength = scanner.nextInt(); // arrayLength- листок, "=" команда к началу написания

        //Программа заполняет массив случайными числами (число X может не оказаться в масcиве).
        int[] source = new int[arrayLength];

        fillArray(source); // заполнение массива рандомными числами

        System.out.println(Arrays.toString(source));

        System.out.println("Какое число вы хотите найти и узнать частоту его повторений?");
        int x = scanner.nextInt(); // arrayLength- листок, "=" команда к началу написания

        int counter = 0;
        for (int i = 0; i < source.length; i++) {
            int currentValue = source[i];
            if (currentValue == x) {
                counter++;
            }
        }

        System.out.println("Число " + x + " встречается " + counter + " раз");
    }

    public static void fillArray(int[] source) {
        Random random = new Random();
        for (int index = 0; index < source.length; index++) { // 0 ... длины массива - 1
            int randomValue = random.nextInt(100);// 0 ... 100
            source[index] = randomValue;
        }
    }

}
