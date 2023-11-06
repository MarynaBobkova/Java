/*
Среднее арифметическое элементов массива

Создайте 2 массива из 5 случайных целых чисел из отрезка от 0 до 5 каждый
Выведите массивы на экран в двух отдельных строках
Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 */
public class AverageArray {
    public static void main(String[] args){
        int[] numbers = new int [5];
        int a = 0;
        int b = 5;
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = (int)(Math.random() * (b-a+1) + a);
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        int[] numbers2 = new int[5];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2 [i] = (int)(Math.random() * (b-a+1) + a);
            System.out.print(numbers2[i] + " ");
        }

        System.out.println();
        CalcAverage(numbers);
        CalcAverage(numbers2);
        if (CalcAverage(numbers) > CalcAverage(numbers2)) {
            System.out.println(CalcAverage(numbers) + " bigger than " + CalcAverage(numbers2));
        } else if (CalcAverage(numbers) < CalcAverage(numbers2)) {
            System.out.println(CalcAverage(numbers) + " smaller than " + CalcAverage(numbers2));
        } else {
            System.out.println(CalcAverage(numbers) + " equals to " + CalcAverage(numbers2));
        }
    }

    private static double CalcAverage(int[] numbers) {
        double summ = 0;
        for (int i = 0; i < numbers.length; i++) {
            summ += numbers[i];
        }
        double average = summ / numbers.length;
        return average;
    }
}
