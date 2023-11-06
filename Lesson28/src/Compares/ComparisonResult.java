package Compares;
//Напишите программу, которая которая сравнивает две версии строковых чисел (например, "1.2.3" и "2.0.1")
// и возвращает результат сравнения и напишите тесты.
//Если 'version1' меньше чем 'version2', метод возвращает '-1'. Если 'version1' равен 'version2',
// метод возвращает '0'. Если 'version1' больше чем 'version2', метод '1'.

public class ComparisonResult {
    public static void main(String[] args) {
        String version1;
        String version2;
    }

    public static int compareVersions(String version1 , String version2) {
        String[] arrayV1 = version1.split("\\.");
        String[] arrayV2 = version2.split("\\.");
        for (int i = 0; i < arrayV1.length; i++) {
           int arrayV1i = Integer.parseInt(arrayV1[i]);
           int arrayV2i = Integer.parseInt(arrayV2[i]);

           if (arrayV1i > arrayV2i) {
                return 1;
            } else if (arrayV1i < arrayV2i) {
                return -1;
            }
        }
        return 0;
    }
}
