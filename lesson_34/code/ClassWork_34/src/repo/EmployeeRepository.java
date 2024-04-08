package repo;

import entity.BaseEmployee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class EmployeeRepository implements EmployeeRepositoryInterface {
    private final BaseEmployee[] EMPLOYEES = new BaseEmployee[10]; // Массив для хранения работников
    private int size = 0; // количесвто работников
    private static int counterId = 46985;

    public boolean addEmployee(BaseEmployee employee) {
        if (size < EMPLOYEES.length) {
            EMPLOYEES[size] = employee;
            size++;
            employee.setId(++counterId);
            return true;
        } else {
            System.out.println("Репозиторий работников заполнен.");
            return false;
        }
    }

    public boolean removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (EMPLOYEES[i].getId() == id) {
                EMPLOYEES[i] = null;
                for (int j = i; j < size; j++) {
                    EMPLOYEES[j] = EMPLOYEES[j + 1];
                }
                size--;
                return true;
            }
        }
        System.out.println("Работник с ID " + id + " не найден.");
        return false;
    }

    public BaseEmployee findEmployeeById(int id) {
        for (int i = 0; i < size; i++) {
            if (EMPLOYEES[i].getId() == id) {
                return EMPLOYEES[i];
            }
        }
        return null;
    }

    public BaseEmployee[] getAllEmployees() {
        return Arrays.copyOf(EMPLOYEES, size);
    }

    public int countEmployees() {
        return size;
    }

    public BaseEmployee[] getAll() {
        return EMPLOYEES;
    }

    public BaseEmployee[] findBySalary(double salaryFrom, double salaryTo) {
        int counter = 0;

        for (int i = 0; i < EMPLOYEES.length; i++) {
            BaseEmployee employee = EMPLOYEES[i];
            if (employee.calculateSalary() >= salaryFrom && employee.calculateSalary() <= salaryTo) {
                counter++;
            }
        }

        BaseEmployee[] result = new BaseEmployee[counter];
        for (int i = 0, j = 0; i < EMPLOYEES.length; i++) {
            BaseEmployee employee = EMPLOYEES[i];
            if (employee.calculateSalary() >= salaryFrom && employee.calculateSalary() <= salaryTo) {
                result[j] = EMPLOYEES[i];
            }
        }

        return result;
    }

    public BaseEmployee[] findByPredict(Predicate<BaseEmployee> predicate) {
        int counter = 0;

        for (int i = 0; i < size; i++) {
            BaseEmployee employee = EMPLOYEES[i];
            if (predicate.test(employee)) {
                counter++;
            }
        }

        BaseEmployee[] result = new BaseEmployee[counter];
        for (int i = 0, j = 0; j < result.length; i++) {
            BaseEmployee employee = EMPLOYEES[i];
            if (predicate.test(employee)) {
                result[j] = EMPLOYEES[i];
                j++;
            }
        }

        return result;
    }

    public BaseEmployee[] sort() {
        BaseEmployee[] copy = Arrays.copyOf(EMPLOYEES, size);
        Arrays.sort(copy);
        return copy;
    }

    public BaseEmployee[] sort(Comparator<BaseEmployee> comparator) {
        BaseEmployee[] copy = Arrays.copyOf(EMPLOYEES, size);
        Arrays.sort(copy, comparator);
        return copy;
    }
}
