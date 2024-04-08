/**
 * @author Andrej Reutow
 * created on 19.09.2023
 */
public class MultiplyTable {

    public static void main(String[] args) {

        // i = 1
            // i = 1, j = 1 - 1 * 1
            // i = 1, j = 2 - 1 * 2
            // i = 1, j = 3 - 1 * 3
            // i = 1, j = ...
            // i = 1, j = 9
        // i = 2
            // i = 2, j = 1 - 2 * 1
            // i = 2, j = 2 - 2 - 2
            // i = 2, j = 3
            // i = 2, j = ...
            // i = 2, j = 9
        // i = 3
            // i = 3, j = 1 - 3 * 1
            // i = 3, j = 2 - 3 * 2
            // i = 3, j = 3
            // i = 3, j = ...
            // i = 3, j = 9

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
