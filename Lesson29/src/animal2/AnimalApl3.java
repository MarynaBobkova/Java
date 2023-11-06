package animal2;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class AnimalApl3 {

    public static void main(String[] args) {
        Animal animalDog = new Dog("Снежок", "Черный");
        Animal animalCat = new Cat("Том", "Серый");

        System.out.println("animalDog: " + animalDog.getName());
        System.out.println("animalCat: " + animalCat.getName());

        System.out.println();
        System.out.println("animalDog: " + animalDog.getDetails());
        System.out.println("animalCat: " + animalCat.getDetails());

        animalCat.eat();
        animalDog.eat();

        if (animalCat instanceof Cat) {
            Cat cat = (Cat) animalCat;
            cat.hunt();

            String name = ((Cat) animalCat).getName();


        }
    }
}