package task;

/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Суммирование чисел от 1 до n с определенным шагом
 */
public class SumWithStep {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 14; i++) {
            sum += 7;
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}

