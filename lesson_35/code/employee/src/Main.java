import entity.BaseEmployee;
import entity.Developer;
import entity.Manager;
import entity.Salesperson;
import repo.EmployeeRepository;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();

        BaseEmployee developer1 = new Developer("John", 25.0, 160, 2022);
        BaseEmployee developer2 = new Developer("Alice", 30.0, 150, 2020);
        BaseEmployee manager1 = new Manager("Bob", 3000.0, 5, 2019);
        BaseEmployee salesperson1 = new Salesperson("Eve", 2000.0, 10, 2021);

        repository.addEmployee(developer1);
        repository.addEmployee(developer2);
        repository.removeEmployee(46987);
        repository.addEmployee(manager1);
        repository.addEmployee(salesperson1);


//        // Повысить зарплату для работников с опытом от 2 до 5 лет на 10%
//        BaseEmployee[] allEmployees = repository.getAllEmployees();
//        for (int i = 0; i < allEmployees.length; i++) {
//            Employee employee = allEmployees[i];
//            if (employee instanceof BaseEmployee) {
//                BaseEmployee baseEmployee = (BaseEmployee) employee;
//                baseEmployee.adjustSalaryByExperience(2, 5, 10);
//            }
//        }

        // Вывести информацию о работниках
        BaseEmployee[] allEmployees = repository.getAllEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
            BaseEmployee employee = allEmployees[i];
            System.out.println(employee);
        }

        System.out.println("Sort by...");
        System.out.println("\nSort by hire year");
//        Comparator<BaseEmployee> comparatorHireYear = new EmployeeHireYearComparator();
        Comparator<BaseEmployee> comparatorHireYear = new Comparator<BaseEmployee>() {
            @Override
            public int compare(BaseEmployee o1, BaseEmployee o2) {
                return o1.getHireYear() - o2.getHireYear();
            }
        };
//        BaseEmployee[] sortedByHireYear = repository.sortByComparator(comparatorHireYear);
        BaseEmployee[] sortedByHireYear = repository.sortByComparator((o1, o2) -> o1.getHireYear() - o2.getHireYear());
        printArray(sortedByHireYear);

        System.out.println("\nSort by id");
//        Comparator<BaseEmployee> comparatorById = new Comparator<BaseEmployee>() {
//
//            @Override
//            public int compare(BaseEmployee o1, BaseEmployee o2) {
//                return o1.getId() - o2.getId();
//            }
//
//        };
//        Comparator<BaseEmployee> comparatorById = (o1, o2) ->  o1.getId() - o2.getId();
        Comparator<BaseEmployee> comparatorById = (o1, o2) -> o1.getId().compareTo(o2.getId());
        BaseEmployee[] sortedById = repository.sortByComparator(comparatorById);
        BaseEmployee[] sortedByIdReversed = repository.sortByComparator(comparatorById.reversed());
        printArray(sortedById);
        System.out.println("Reversed");
        printArray(sortedByIdReversed);


        System.out.println("\nSort by name");
        Comparator<BaseEmployee> comparatorByName = (o1, baseEmployee2) -> o1.getName().compareTo(baseEmployee2.getName());
        BaseEmployee[] sortedByName = repository.sortByComparator(comparatorByName);
        printArray(sortedByName);
    }


    private static void printArray(BaseEmployee[] array) {
        for (int i = 0; i < array.length; i++) {
            BaseEmployee employee = array[i];
            System.out.println(employee);
        }
    }
}
