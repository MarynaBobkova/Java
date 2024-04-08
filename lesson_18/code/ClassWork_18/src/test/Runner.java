package test;

/**
 * @author Andrej Reutow
 * created on 27.09.2023
 */
public class Runner {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Cat cat1 = (Cat) cat;
        cat1.sayCat();
        Animal dog1 = (Animal) cat;
    }
}
