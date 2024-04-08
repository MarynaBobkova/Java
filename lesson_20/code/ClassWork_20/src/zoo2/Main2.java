package zoo2;

public class Main2 {
    public static void main(String[] args) {
// В этой части кода мы создаем объекты разных типов: Animal, Dog и Cat.
// Обратите внимание, что animalDog и animalCat объявлены как тип Animal,
// но на самом деле могут содержать объекты подклассов Dog и Cat.
        Animal animal = new Animal();
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();

// Вызываем метод makeSound() для объекта типа Animal.
// Этот метод вызовется из суперкласса Animal, так как объект animal объявлен как тип Animal.
        animal.makeSound(); // Выведет: Звук животного

// Вызываем метод makeSound() для объекта типа Dog.
// В этом случае вызывается метод makeSound() из класса Dog, так как animalDog содержит объект Dog.
        animalDog.makeSound(); // Выведет: Гав-гав!

// Следующие две строки вызывают методы fetchBall() и guardHouse() для animalDog.
// Однако они вызывают ошибку компиляции, так как объект объявлен как тип Animal,
// и компилятор не знает о методах, определенных только в классе Dog.
// animalDog.fetchBall(); // Ошибка, т.к. animalDog объявлен как тип Animal
// animalDog.guardHouse(); // Ошибка, т.к. animalDog объявлен как тип Animal

// Вызываем метод makeSound() для объекта типа Cat.
// Здесь происходит переопределение метода makeSound() в классе Cat,
// поэтому вызывается метод из класса Cat.
        animalCat.makeSound(); // Выведет: Мяу-мяу!

// Следующие две строки вызывают методы hunt() и climbTree() для animalCat.
// Как и в случае с animalDog, они вызывают ошибку компиляции,
// так как объект объявлен как тип Animal и не имеет доступа к методам, определенным только в классе Cat.
// animalCat.hunt(); // Ошибка, т.к. animalCat объявлен как тип Animal
// animalCat.climbTree(); // Ошибка, т.к. animalCat объявлен как тип Animal

// Приведение типов (casting)
// Нисходящее приведение (Downcasting):
// Мы выполняем нисходящее приведение объекта animalDog к типу Dog, чтобы вызвать методы класса Dog.
        Dog castedDog = (Dog) animalDog; // Нисходящее приведение

// Теперь мы можем вызвать метод makeSound() из класса Dog,
// а также методы fetchBall() и guardHouse(), определенные только в классе Dog.
        castedDog.makeSound();  // Выведет: Гав-гав!
        castedDog.fetchBall();  // Выведет: Собака принесла мяч
        castedDog.guardHouse(); // Выведет: Собака охраняет дом

// Аналогично нисходящее приведение происходит и для объекта animalCat.
        Cat castedCat = (Cat) animalCat;
        castedCat.makeSound();
        castedCat.hunt();
        castedCat.climbTree();

// Есть еще один вариант приведения типов, где мы выполняем приведение типа прямо в выражении.
// Здесь мы сначала приводим animalCat к типу Cat и вызываем методы напрямую.
        ((Cat) animalCat).makeSound();
        ((Cat) animalCat).climbTree();
        ((Cat) animalCat).hunt();

// Проверка instanceof:
// Мы используем оператор instanceof для проверки, является ли объект типа Dog перед выполнением нисходящего приведения.
// Это важно для предотвращения ошибок времени выполнения.
        if (animalDog instanceof Dog) {
            Dog anotherDog = (Dog) animalDog; // Нисходящее приведение

            // Теперь мы можем вызвать методы makeSound(), fetchBall() и guardHouse() из класса Dog,
            // так как мы убедились, что объект является экземпляром класса Dog.
            anotherDog.makeSound();  // Выведет: Гав-гав!
            anotherDog.fetchBall();  // Выведет: Собака принесла мяч
            anotherDog.guardHouse(); // Выведет: Собака охраняет дом
        } else {
            System.out.println("Этот объект не является экземпляром Dog.");
        }

// Объяснение о том, что собака не может стать кошкой, и наоборот,
// но оба могут стать экземплярами суперкласса Animal.
// В массиве можно хранить объекты разных подклассов, если они являются экземплярами суперкласса.
// В данном случае, animalDog и animalCat приводятся к типу суперкласса Animal для хранения в массиве.
// Хотя они изначально были объектами подклассов Dog и Cat.
        Animal[] animals = new Animal[5];
        animals[0] = castedDog;
        animals[1] = castedCat;
        animals[2] = animal;
        animals[3] = animalCat;
        animals[4] = animalDog;

// В этом цикле мы вызываем метод makeSound() для каждого объекта в массиве,
// и он вызывается в соответствии с типом объекта (полиморфизм).
        for (int a = 0; a < animals.length; a++) {
            animals[a].makeSound();
        }
    }
}
