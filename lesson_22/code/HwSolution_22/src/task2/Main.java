package task2;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class Main {

    public static void main(String[] args) {
        DataTime dataTime1 = new DataTime(9, 9);
        DataTime dataTime2 = new DataTime(12, 9);
        DataTime dataTime3 = new DataTime(14, 58);

        DataTime dataTimeTarget = new DataTime(14, 58);

        System.out.println(dataTime1);
        System.out.println(dataTime2);
        System.out.println(dataTime3);
        System.out.println(dataTimeTarget);

        DataTime[] dataTimes = {dataTime1, dataTime2, dataTime3};

        for (int i = 0; i < dataTimes.length; i++) {
            if (dataTimes[i].equals(dataTimeTarget)) {
                System.out.println("Искомый элемент найден по индексом " + i);
            }
        }
    }
}
