package HW35;
//Создайте массив строк (например, ["apple", "banana", "cherry"]).
//Определите предикат Predicate<String>, который будет проверять, начинается ли строка на определенную букву ( например, "a").
//Пройдите по массиву и используйте предикат для фильтрации, чтобы оставить только строки, удовлетворяющие условию.
//Выведите отфильтрованные строки на экран.

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayString {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry"};
        Predicate<String> startsWithA = str -> str.startsWith("a");
        for (int i = 0; i < array.length; i++) {
            if(startsWithA.test(array[i])){
                System.out.println(array[i]);
            }
        }
    }
}
