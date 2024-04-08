package binary_search_obj;

import binary_search_obj.model.City;

import java.util.Arrays;
import java.util.Comparator;


// ctrl + q - документация методов/классов ....
// shift + f6 - рефакторинг

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */
public class Main {
    public static void main(String[] args) {
        City cityBerlin = new City("Berlin", 4_000_000);
        City cityMuenchen = new City("Muenchen1", 1_500_000);
        City cityHamburg = new City("Hamburg11", 2_000_000);

        City cityBerlinCopy = new City("Berlin", 4_000_000);


        City[] cities = {cityBerlin, cityHamburg, cityMuenchen};

        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));
        int findBerlinIndex = Arrays.binarySearch(cities, cityBerlinCopy);
        System.out.println(findBerlinIndex);
        System.out.println("Result search berlin: " + cities[findBerlinIndex]);


        System.out.println("\nSort by name");
        Comparator<City> cityComparatorByName = (city1, city2) -> city1.getName().compareTo(city2.getName());
//        Arrays.sort(cities, cityComparatorByName);
        System.out.println(Arrays.toString(cities));

        findBerlinIndex = Arrays.binarySearch(cities, cityBerlinCopy, cityComparatorByName);
        System.out.println(findBerlinIndex);
        System.out.println("Result search berlin: " + cities[findBerlinIndex]);


        System.out.println("\nSort by name length");
        Comparator<City> cityComparatorByNameLength = (city1, city2) -> city1.getName().length() - city2.getName().length();
//        Arrays.sort(cities, cityComparatorByNameLength);
//        System.out.println(Arrays.toString(cities));

        findBerlinIndex = Arrays.binarySearch(cities, cityBerlinCopy, cityComparatorByName);
        System.out.println(findBerlinIndex);
        System.out.println("Result search berlin: " + cities[findBerlinIndex]);
    }
}
