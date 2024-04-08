/**
 * @author Andrej Reutow
 * created on 18.10.2023
 */
public class GenericExample {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Привет", "Мир", "Java"};
        Car[] carArray = {
                new Car("Audi", "TT"),
                new Car("Audi", "A4"),
                new Car("BMW", "X5"),
                new Car("Mercedes-Benz", "C-200"),
        };

        System.out.println("Массив целых чисел:");
        printArray(intArray);

        System.out.println("Массив строк:");
        printArray(stringArray);

        System.out.println("Массив машин:");
        printArray(carArray);
    }

    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            T item = array[i];
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
