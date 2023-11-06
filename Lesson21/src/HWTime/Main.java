package HWTime;

public class Main {
    public static void main(String[] args) {
        DataTime dataTime1 = new DataTime(9,9,12,3,2012);
        DataTime dataTime2 = new DataTime(12,9,1,10,2022);
        DataTime dataTime3 = new DataTime(14,58,10,5,2023);

        DataTime dataTimeTarget = new DataTime(14,58,10, 5, 2023);
        System.out.println(dataTime1);
        System.out.println(dataTime2);
        System.out.println(dataTime3);
        System.out.println(dataTimeTarget);

        DataTime[] dataTimes = {dataTime1, dataTime2, dataTime3};
        for (int i = 0; i < dataTimes.length; i++) {
            if (dataTimes[i].equals(dataTimeTarget)) {
                System.out.println("Искомый элемент найден под индексом " + i);

            }

        }
    }
}
