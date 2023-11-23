package task2;

import java.util.function.Function;

public class ConvertTypes {
    public static void main(String[] args) {
//         Есть объект собаки
//        Написать ф-ю, которая преобразует объект собаки в кошки, при этом увеличивая возраст в 2р
//         и добавляю к цвету приставку светло-
//
//         Собака - 3 года, серая -- Кот- 6 лет, светло-серая
        Function<Dog, Cat> convertor = x -> new Cat(x.getAge() * 2, "светло-" + x.getColor());

        Dog dog = new Dog(3, "серый");
        System.out.println("Исходная собака - " + dog);
        System.out.println("Получившийся кот - " + convertor.apply(dog));

        Dog dog1 = new Dog(1, "зеленый");
        Dog dog2 = new Dog(4, "синий");
        System.out.println("Исходная собака - " + dog1);
        System.out.println("Получившийся кот - " + convertor.apply(dog1));
        System.out.println("Исходная собака - " + dog2);
        System.out.println("Получившийся кот - " + convertor.apply(dog2));



    }
}
