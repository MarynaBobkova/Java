package tools;

import entity.BaseEmployee;
import entity.Developer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test_entity.Animal;
import test_entity.Car;

/**
 * @author Andrej Reutow
 * created on 24.10.2023
 */
public class ArrayToolsTest {

    @Test
    public void testPrintArray() {
        BaseEmployee developer1 = new Developer("dev1", 100, 180, 2012); //salary = 18_000
        BaseEmployee developer2 = new Developer("dev2", 200, 150, 2018); //salary = 30_000
        BaseEmployee developer3 = new Developer("dev3", 300, 200, 2024); // salary = 60_000
        BaseEmployee developer4 = new Developer("dev3", 400, 200, 2020); // salary = 80_000
        BaseEmployee[] employees = {
                developer1,
                developer2,
                developer3,
                developer4
        };

        ArrayTools.print(employees);

        Car[] cars = {
                new Car(1, "Bmw"),
                new Car(2, "Audi"),
                new Car(3, "VW"),
        };

        ArrayTools.print(cars);
    }

    @Test
    void test_searchById() {
        BaseEmployee developer1 = new Developer("dev1", 100, 180, 2012); //salary = 18_000
        BaseEmployee developer2 = new Developer("dev2", 200, 150, 2018); //salary = 30_000
        BaseEmployee developer3 = new Developer("dev3", 300, 200, 2024); // salary = 60_000
        BaseEmployee developer4 = new Developer("dev3", 400, 200, 2020); // salary = 80_000
        BaseEmployee[] employees = {
                developer1,
                developer2,
                developer3,
                developer4
        };

        Car[] cars = {
                new Car(1, "Bmw"),
                new Car(2, "Audi"),
                new Car(3, "VW"),
        };

        Car result = ArrayTools.searchById(cars, 2);
        Assertions.assertEquals(cars[1], result);

        Animal[] animals = {
                new Animal(),
                new Animal(),
                new Animal(),
                new Animal()
        };
        Animal animalResult = ArrayTools.searchById(animals, 1);
        Assertions.assertEquals(animals[0], animalResult);

        Animal animalResult2 = ArrayTools.searchById(animals, 2);
        Assertions.assertNull(animalResult2);
    }
}
