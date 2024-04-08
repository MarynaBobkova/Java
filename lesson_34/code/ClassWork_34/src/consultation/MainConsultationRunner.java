package consultation;

import consultation.comparator.PersonAgeComparator;
import consultation.comparator.PersonZipCodeComparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Andrej Reutow
 * created on 23.10.2023
 */
public class MainConsultationRunner {

    public static void main(String[] args) {
        Person personAndre = new Person("Andrej", 35, 10557);
        Person personMaria = new Person("Maria", 33, 10557);
        Person personKatja = new Person("Katja", 33, 10089);
        Person personVajsa = new Person("Vasja", 25, 10369);
        Person personPetja = new Person("Pertja", 43, 10089);

        Person[] people = {personAndre, personMaria, personKatja, personVajsa, personPetja};

        System.out.println("\nBefore sort");
        printArray(people);

        System.out.println("\nSort by...");
        System.out.println("\nSort by age");
        Comparator<Person> personComparatorByAge = new PersonAgeComparator();
//        Comparator<Person> personComparatorByZipCode = new PersonZipCodeComparator();
        Comparator<Person> personComparatorByZipCode = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getZipCode() - o2.getZipCode();
            }
        };

        Arrays.sort(people, personComparatorByAge);
        printArray(people);

        System.out.println("\nSort by zipCode");
        Arrays.sort(people, personComparatorByZipCode);
        printArray(people);
    }

    private static void printArray(Person[] source) {
        for (int i = 0; i < source.length; i++) {
            System.out.println(source[i]);
        }
    }
}
