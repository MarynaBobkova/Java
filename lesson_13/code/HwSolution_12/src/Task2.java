/**
 * @author Andrej Reutow
 * created on 20.09.2023
 */

// Напишите программу, которая удаляет из массива элемент по условиям:
//- по заданной позиции.
//- по значению
public class Task2 {

    public static void main(String[] args) {
        int[] source = {1, 5, 10, 115, 120};

        System.out.println("Начальное состояние массива");
        printArray(source); // печать массива

        System.out.println("############################");

        // Удаление элемента по индексу
        int indexToRemove = 1;
        System.out.println("Удаление по индексу: " + indexToRemove);
        removeByIndex(source, indexToRemove); // удаление по индексу
        printArray(source); // печать массива

        System.out.println("############################");

        // Удаление элемента по значению
        int valueToRemove = 120;
        System.out.println("Удаление по значению: " + valueToRemove);
        removeByElement(source, valueToRemove); // удаление по значению
        printArray(source); // печать массива
    }

    public static void removeByElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                array[i] = 0;
                System.out.println("Элемент " + element + " удален");
            }
        }
    }

    public static void removeByIndex(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            array[index] = 0;
        } else {
            System.out.println("Ошибка, индекса" + index + " не существует!");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index:\t" + i + " value: " + array[i]);
        }
    }
}
