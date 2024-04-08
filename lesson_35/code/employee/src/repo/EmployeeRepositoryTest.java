package repo;

import entity.BaseEmployee;
import entity.Developer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import predicate.EmployeeHireYearPredicate;
import predicate.EmployeeSalaryPredicate;

import java.util.function.Predicate;

/**
 * @author Andrej Reutow
 * created on 18.10.2023
 */
class EmployeeRepositoryTest {

    private EmployeeRepository repository;

    @BeforeAll // tests
    public static void init() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach // test
    public void setUp() {
        System.out.println("@BeforeEach");
        repository = new EmployeeRepository();
    }

    @Test
    void test_countEmployees() {

        int result = repository.countEmployees();

        Assertions.assertEquals(0, result);
    }

    @Test
    void test_removeEmployee_() {
        //Дано
        BaseEmployee developer1 = new Developer("dev1", 100, 180, 2023);
        BaseEmployee developer2 = new Developer("dev2", 200, 150, 2023);
        BaseEmployee developer3 = new Developer("dev3", 300, 200, 2023);

        repository.addEmployee(developer1);
        repository.addEmployee(developer2);
        repository.addEmployee(developer3);

        BaseEmployee[] employees = repository.getAll();
        Assertions.assertEquals(developer2.getName(), employees[1].getName());

        // Когда
        boolean isRemoved = repository.removeEmployee(developer2.getId());

        // Тогда
        Assertions.assertTrue(isRemoved);
        Assertions.assertEquals(2, repository.countEmployees());

        Assertions.assertEquals(developer1.getName(), employees[0].getName());
        Assertions.assertEquals(developer3.getName(), employees[1].getName());
        for (int i = 2; i < employees.length; i++) {
            Assertions.assertNull(employees[i]);
        }
    }

    @Test
    public void test_filterBySalary() {
        BaseEmployee developer1 = new Developer("dev1", 100, 180, 2012); //salary = 18_000
        BaseEmployee developer2 = new Developer("dev2", 200, 150, 2018); //salary = 30_000
        BaseEmployee developer3 = new Developer("dev3", 300, 200, 2024); // salary = 60_000
        BaseEmployee developer4 = new Developer("dev3", 400, 200, 2020); // salary = 80_000

        repository.addEmployee(developer4);
        repository.addEmployee(developer1);
        repository.addEmployee(developer3);
        repository.addEmployee(developer2);

        Predicate<BaseEmployee> predicate = new EmployeeSalaryPredicate(30_000, 60_000);
        BaseEmployee[] filteredBySalary = repository.filterBy(predicate);

//        Assertions.assertEquals(2, filteredBySalary.length);
        BaseEmployee[] expected = {developer3, developer2};
        Assertions.assertArrayEquals(expected, filteredBySalary);
    }

    @Test
    public void test_filterByHireYear() {
        BaseEmployee developer1 = new Developer("dev1", 100, 180, 2012); //salary = 18_000
        BaseEmployee developer2 = new Developer("dev2", 200, 150, 2018); //salary = 30_000
        BaseEmployee developer3 = new Developer("dev3", 300, 200, 2024); // salary = 60_000
        BaseEmployee developer4 = new Developer("dev3", 400, 200, 2020); // salary = 80_000

        repository.addEmployee(developer4);
        repository.addEmployee(developer1);
        repository.addEmployee(developer3);
        repository.addEmployee(developer2);

        Predicate<BaseEmployee> predicate = new EmployeeHireYearPredicate(2012, 2018);
        BaseEmployee[] filteredBySalary = repository.filterBy(predicate);

//        Assertions.assertEquals(2, filteredBySalary.length);
        BaseEmployee[] expected = {developer1, developer2};
        Assertions.assertArrayEquals(expected, filteredBySalary);
    }

    @Test
    public void test_filterBy_predicateFilterByNameStartsWith() {
        BaseEmployee developer1 = new Developer("dev1", 100, 180, 2012); //salary = 18_000
        BaseEmployee developer2 = new Developer("dev2", 200, 150, 2018); //salary = 30_000
        BaseEmployee developer3 = new Developer("dev3", 300, 200, 2024); // salary = 60_000
        BaseEmployee developer4 = new Developer("dev3", 400, 200, 2020); // salary = 80_000

        repository.addEmployee(developer4);
        repository.addEmployee(developer1);
        repository.addEmployee(developer3);
        repository.addEmployee(developer2);

        Predicate<BaseEmployee> predicate = e -> e.getName().startsWith("d");
        BaseEmployee[] filteredBySalary = repository.filterBy(predicate);

//        Assertions.assertEquals(2, filteredBySalary.length);
        BaseEmployee[] expected = {developer4, developer1, developer3, developer2};
        Assertions.assertArrayEquals(expected, filteredBySalary);
    }
}
