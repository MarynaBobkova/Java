// Объявляем основной класс с именем BubbleSort
public class BubbleSort {
    // Основная функция, которая запускается при выполнении программы
    public static void main(String[] args) {
        // Объявляем и инициализируем массив, который нужно отсортировать
        int[] arr = {6, 5, 4, 3, 2, 1};

        // Вызываем функцию сортировки пузырьком
        bubbleSort(arr);

        // Выводим отсортированный массив на экран
        for (int j = 0; j < arr.length; j++) {
            int i = arr[j];
            System.out.print(i + " ");
        }
    }

    // Функция сортировки пузырьком
    public static void bubbleSort(int[] arr) {
        // Получаем размер массива
        int n = arr.length;

        // Первый цикл: проходим по всем элементам массива
        for (int i = 0; i < n - 1; i++) {
            // Второй цикл: сравниваем и меняем местами пары элементов
            for (int j = 0; j < n - 1 - i; j++) {
                // Сравниваем текущий и следующий элементы
                if (arr[j] > arr[j + 1]) {
                    // Если текущий элемент больше следующего, меняем их местами
                    int temp = arr[j];  // Временная переменная для хранения текущего элемента
                    arr[j] = arr[j + 1];  // Присваиваем текущему элементу значение следующего
                    arr[j + 1] = temp;  // Присваиваем следующему элементу сохраненное значение текущего
                }
            }
        }
    }

    public static void bubbleSortWithoutLoopArrLength3() {
        int[] arr = {3, 1, 2};

        // --- Первая итерация ---

        // Сравниваем первый и второй элементы и меняем их местами при необходимости
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        // Сравниваем второй и третий элементы и меняем их местами при необходимости
        if (arr[1] > arr[2]) {
            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }

        // --- Вторая итерация ---

        // Сравниваем первый и второй элементы и меняем их местами при необходимости
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }

    public static void bubbleSortWithoutLoopArrLength5V2() {
        // Объявляем и инициализируем массив из 6 элементов
        int[] arr = {3, 1, 2, 6, 4, 5}; // начальное состояние: [3, 1, 2, 6, 4, 5]

        // --- Первая итерация ---                                                  // [3, 1, 2, 6, 4, 5] (начальное состояние)
        if (arr[0] > arr[1]) { int temp = arr[0]; arr[0] = arr[1]; arr[1] = temp; } // [1, 3, 2, 6, 4, 5]
        if (arr[1] > arr[2]) { int temp = arr[1]; arr[1] = arr[2]; arr[2] = temp; } // [1, 2, 3, 6, 4, 5]
        if (arr[2] > arr[3]) { int temp = arr[2]; arr[2] = arr[3]; arr[3] = temp; } // [1, 2, 3, 6, 4, 5] (нет изменений)
        if (arr[3] > arr[4]) { int temp = arr[3]; arr[3] = arr[4]; arr[4] = temp; } // [1, 2, 3, 4, 6, 5]
        if (arr[4] > arr[5]) { int temp = arr[4]; arr[4] = arr[5]; arr[5] = temp; } // [1, 2, 3, 4, 5, 6]

        // --- Вторая итерация ---
        if (arr[0] > arr[1]) { int temp = arr[0]; arr[0] = arr[1]; arr[1] = temp; } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[1] > arr[2]) { int temp = arr[1]; arr[1] = arr[2]; arr[2] = temp; } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[2] > arr[3]) { int temp = arr[2]; arr[2] = arr[3]; arr[3] = temp; } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[3] > arr[4]) { int temp = arr[3]; arr[3] = arr[4]; arr[4] = temp; } // [1, 2, 3, 4, 5, 6] (нет изменений)

        // --- Третья итерация ---
        if (arr[0] > arr[1]) { int temp = arr[0]; arr[0] = arr[1]; arr[1] = temp; } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[1] > arr[2]) { int temp = arr[1]; arr[1] = arr[2]; arr[2] = temp; } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[2] > arr[3]) { int temp = arr[2]; arr[2] = arr[3]; arr[3] = temp; } // [1, 2, 3, 4, 5, 6] (нет изменений)

        // --- Четвертая итерация ---
        if (arr[0] > arr[1]) { int temp = arr[0]; arr[0] = arr[1]; arr[1] = temp; } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[1] > arr[2]) { int temp = arr[1]; arr[1] = arr[2]; arr[2] = temp; } // [1, 2, 3, 4, 5, 6] (нет изменений)

        // --- Пятая и последняя итерация ---

        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)
    }

    public static void bubbleSortWithoutLoopArrLength5V1() {
        // Объявляем и инициализируем массив из 6 элементов
        int[] arr = {3, 1, 2, 6, 4, 5}; // начальное состояние: [3, 1, 2, 6, 4, 5]

        // --- Первая итерация ---
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        } // [1, 3, 2, 6, 4, 5]
        if (arr[1] > arr[2]) {
            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        } // [1, 2, 3, 6, 4, 5]
        if (arr[2] > arr[3]) {
            int temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        } // [1, 2, 3, 6, 4, 5] (нет изменений)
        if (arr[3] > arr[4]) {
            int temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        } // [1, 2, 3, 4, 6, 5]
        if (arr[4] > arr[5]) {
            int temp = arr[4];
            arr[4] = arr[5];
            arr[5] = temp;
        } // [1, 2, 3, 4, 5, 6]

        // --- Вторая итерация ---
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[1] > arr[2]) {
            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[2] > arr[3]) {
            int temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[3] > arr[4]) {
            int temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)

        // --- Третья итерация ---
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[1] > arr[2]) {
            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[2] > arr[3]) {
            int temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)

        // --- Четвертая итерация ---
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)
        if (arr[1] > arr[2]) {
            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)

        // --- Пятая и последняя итерация ---

        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        } // [1, 2, 3, 4, 5, 6] (нет изменений)
    }
}
