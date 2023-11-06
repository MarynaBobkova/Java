import java.util.Scanner;
/* Число встреч
Пользователь вводит два числа: длину массива и число X. Программа заполняет массив
 случайными числами (число X может не оказаться в масиве). Задача — найти, сколько раз число X встречается в массиве.
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the array lenght: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        System.out.println("Type number: ");
        int userNumber = scanner.nextInt();

        int a = 0;
        int b = 15;
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = (int)(Math.random() * (b-a+1) + a);
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (userNumber == numbers[i]) {
                result++;
            }
        }
        System.out.println("Number " + userNumber + " used in array " + result + " times" );
    }
}
