/**
 * @author Andrej Reutow
 * created on 18.09.2023
 */
public class Pizza {
    public static void main(String[] args) {
        int[] slicesEaten = {2, 4, 3, 5, 1, 3};
        String[] friendNames = {"Алекс", "Борис", "Вера", "Галя", "Дима", "Елена"};

        int maxSlices = 0;
        int index = 0;

        for (int i = 0; i < slicesEaten.length; i++) {
            if (slicesEaten[i] > maxSlices) {
                maxSlices = slicesEaten[i];
                index = i;
            }
        }

        System.out.println("Больше всех пиццы съел(а) " + friendNames[index] + ", " + maxSlices + " кусков.");
    }
}
