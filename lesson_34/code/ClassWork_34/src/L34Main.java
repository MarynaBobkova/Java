import entity.BaseEmployee;
import entity.Developer;
import entity.Manager;
import entity.Salesperson;
import repo.EmployeeRepository;

import java.util.Comparator;
import java.util.function.Predicate;

public class L34Main {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        employeeRepository.addEmployee(new Developer("Max", 25D, 180, 2018));
        employeeRepository.addEmployee(new Developer("Andre", 28D, 186, 2022));
        employeeRepository.addEmployee(new Manager("Marina", 4500, 3, 2023));
        employeeRepository.addEmployee(new Salesperson("Nick", 5000, 6, 2017));

//        Predicate<BaseEmployee> baseEmployeePredicate = new Predicate<>() {
//            @Override
//            public boolean test(BaseEmployee baseEmployee) {
//                return baseEmployee.calculateSalary() >= 1000 && baseEmployee.calculateSalary() <= 2000;
//            }
//        };

        BaseEmployee[] byPredictSalary = employeeRepository.findByPredict(getFilterBySalary(1000, 2000));
        BaseEmployee[] byPredictByHireYear = employeeRepository.findByPredict(getFilterByExperience(2022, 2024));

        Comparator<BaseEmployee> comparatorById = new Comparator<BaseEmployee>() {
            @Override
            public int compare(BaseEmployee o1, BaseEmployee o2) {
                return o1.getId() - o2.getId();
            }
        };
        Comparator<BaseEmployee> comparatorByName = (be1, be2) -> be1.getName().compareTo(be2.getName());
        Comparator<BaseEmployee> comparatorBySalary = (be1, be2) -> (int) (be1.calculateSalary() - be2.calculateSalary());

        System.out.println("Print all Employee\n");
        printAll(employeeRepository.getAllEmployees());
        System.out.println("Print all\n");
        printAll(employeeRepository.getAll());

        System.out.println("Print all filtered by Salary\n");
        printAll(byPredictSalary);
        System.out.println("Print all filtered by HireYear\n");
        printAll(byPredictByHireYear);
        System.out.println("Sorting...\n");

        BaseEmployee[] sortedById = employeeRepository.sort(comparatorById);
        BaseEmployee[] sortedByName = employeeRepository.sort(comparatorByName);
        BaseEmployee[] sortedBySalary = employeeRepository.sort(comparatorBySalary);
        BaseEmployee[] sortedByHireYear = employeeRepository.sort();

        System.out.println("Print all sorted by Id\n");
        printAll(sortedById);
        System.out.println("Print all sorted by Name\n");
        printAll(sortedByName);
        System.out.println("Print all sorted by Salary\n");
        printAll(sortedBySalary);
        System.out.println("Print all sorted by Hire year\n");
        printAll(sortedByHireYear);
    }

    private static Predicate<BaseEmployee> getFilterBySalary(int minSalary, int maxSalary) {
        return baseEmployee -> baseEmployee.calculateSalary() >= maxSalary && minSalary <= maxSalary;
    }

    private static Predicate<BaseEmployee> getFilterByExperience(int minYear, int maxYear) {
        return baseEmployee -> baseEmployee.getHireYear() >= minYear &&
                baseEmployee.getHireYear() <= maxYear;
    }


    private static void printAll(BaseEmployee[] source) {

        for (int i = 0; i < source.length; i++) {
            System.out.println("Index: " + i + ", " + source[i]);
            if (source[i] != null)
                System.out.println(source[i].calculateSalary());
        }

    }


}
