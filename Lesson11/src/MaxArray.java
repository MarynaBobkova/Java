/*
Create an array of 12 random integers ranging from -15 to 15.
Determine which element is the maximum in this array and report the index
of its last occurrence in the array.
 */
public class MaxArray {
    public static void main(String[] args){
        //int n = (int)(Math.random() * (b-a+1) + a) - генерирует случайное целое число в интервале [a,b]

        int[] numbers = new int [12];

        //Заполняем массив случайными числами
        int a = -15;
        int b = 15;
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = (int)(Math.random() * (b-a+1) + a);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int max = numbers[0]; //первое возможное значение макс
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("Max element " + max + " index = " + index);
    }
}
