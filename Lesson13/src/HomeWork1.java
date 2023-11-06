//Условие: Напишите программу на Java, которая использует бинарный поиск для нахождения
// индекса первого вхождения числа в отсортированном массиве с повторяющимися элементами.
//Пример:
//Вход: Отсортированный массив [1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19] и число 3. Выход: Индекс первого вхождения числа 3 в массиве

public class HomeWork1 {
    public static void main(String[] args) {
        int [] array = {1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19};
        //int [] array = {1, 3};
        //int [] array = {};
        //int [] array = {3,3,3,3,3,3};
        //int [] array = {3};

        int middle = array.length / 2;
        int left = 0;
        int right = array.length - 1;
        int number = 3;

        for (int i = 0; i < array.length ; i++) {
            if (array[middle] > number) {
                right = middle;
            } else if (array[middle] < number) {
                left = middle;
            } else if (array[middle] == number) {
                for (int j = middle; j >=0 ; j--) {
                    if (array[j] < number) {
                        System.out.println("Your index is " + (j+1));
                        return;
                    }
                }
                System.out.println("Your index is " + 0);
                return;
            }
            middle = (right + left) / 2;
        }

        System.out.println("Your index is NO ");
    }
}
