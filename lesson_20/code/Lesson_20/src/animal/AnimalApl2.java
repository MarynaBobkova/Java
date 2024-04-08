package animal;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class AnimalApl2 {

    public static void main(String[] args) {

        // создаем объекты разных типов:  Animal, Dog, Cat
        // обратите внимание, что animalDog, animalCat объявлены как тип Animal
        // animalDog,animalCat, на самом деле могут содержать объекты подклассов (Dog, Cat)
        Animal animal = new Animal();
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();


        animal.makeSound(); // Животное издает звук, не понятно какой именно!
        animalDog.makeSound(); // Гав-гав!
        animalCat.makeSound(); // Мяу-мяу!

        // Приведение типов (casting)
        // Нисходящее приведение (Downcasting):
        // animalDog объявлен как тип Animal
        // Мы выполняем нисходящее приведение объекта animalDog к типу Dog, чтобы вызвать методы класса Dog.
        // не безопастное нисходящее приведение типа, т.к. animalDog (в теории) моежен хранить Cat или Dog
        Dog dog = (Dog) animalDog; // Нисходящее приведение (Downcasting)

        dog.makeSound();
        dog.fetchBall();
        dog.guardHouse();

        // animalDog объявлен как тип Animal
        // Мы выполняем нисходящее приведение объекта animalDog к типу Dog, чтобы вызвать методы класса Dog.
        // безопастным нисходящим приведение типа, проверям является ли animalDog Cat. Используя animalDog instanceof Cat
        if (animalDog instanceof Cat) {
            Cat cat = (Cat) animalDog;
            cat.makeSound();
            cat.climbTree();
            cat.hunt();
        } else {
            System.out.println("animalDog не может быть преобразован в Cat");
        }

        if (animalCat instanceof Cat) {
            Cat cat = (Cat) animalCat;
            cat.makeSound();
            cat.climbTree();
            cat.hunt();
        } else {
            System.out.println("animalDog не может быть преобразован в Cat");
        }


        //  Восходящее приведение (Upcasting)
        Cat catTom = new Cat();
        Dog dogBarbos = new Dog();

        Animal animalDogBarbos = dogBarbos;
        Animal animalCatTom = catTom;
        animalDogBarbos.makeSound();

        dogBarbos.fetchBall();


        System.out.println("########\n");
        Animal[] animals = new Animal[4];
        animals[0] = animalDog;
        animals[1] = animalCat;
        animals[2] = dog;
        animals[3] = animal;

        for (int i = 0; i < animals.length; i++) {
            Animal currentValue = animals[i];
            doSomth(currentValue);
        }
    }

    private static void doSomth(Animal animal) {
        animal.makeSound();
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.hunt();
            cat.climbTree();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetchBall();
            dog.guardHouse();
        }
    }
}
