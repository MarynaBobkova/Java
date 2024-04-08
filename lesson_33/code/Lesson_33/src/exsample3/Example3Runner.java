package exsample3;

import exsample3.entity.Animal;
import exsample3.entity.Dog;

/**
 * @author Andrej Reutow
 * created on 20.10.2023
 */
public class Example3Runner {

    public static void main(String[] args) {
        // создание объекта не возможно, т.к. конструктор приватный
        //  SomeUtilityClass utilityClass = new SomeUtilityClass();

        Animal animal = new Dog("Black", "Tom", "Такса");
    }
}
