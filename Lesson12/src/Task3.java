/*
Задача 3 Частотный анализ
Программа должна подсчитать,
сколько раз каждое число встречается в массиве и вывести результат в коноль.
 */
public class Task3 {
    public static void main(String[] args) {
        int [] counter = new int [5];
        counter[0] = 5;
        counter[1] = 2;
        counter[2] = 5;
        counter [3] = 5;
        counter [4] = 4;

        int [] result = new int [5];

        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter.length; j++) {
                System.out.println("Сравниваем элемент массива i = " + i +" с элементом j = " +j + ". Значения: i " + counter[i] + " j " + counter[j] + " равны ли они: " + (counter[j] == counter[i]));
                if (counter[j] == counter[i]) {
                    System.out.println("Нашли совпадение - элементы с индексами [" + i + "] и [" + j + "] имеют значение " +counter[i]);
                    result[i]++;
                }
            }
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println("Number " + counter[i] + " encounters " + result[i]);
        }
    }
}
