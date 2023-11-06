/* С помощью вложенного цикла For (цикл в цикле) написать метод, выводящий на экран треугольник такого вида:
            1
            12
            123
            1234
            12345
            123456
 */

public class HomeWork5 {
    public static void main(String[] args) {

        for (int i = 0; i < 6 ; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

