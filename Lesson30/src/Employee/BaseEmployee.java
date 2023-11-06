package Employee;
// Реализует интерфейс Employee и предоставляет общую функциональность для всех работников.
//Содержит общие поля и методы, такие как name, id, hireYear, salary, adjustSalaryByExperience().
//Метод calculateSalary() оставлен для реализации в подклассах.

public abstract class BaseEmployee implements Employee {
    private String name;
    private int id;
    private int hireYear;

    public BaseEmployee(String name, int id, int hireYear, double salary) {
        this.name = name;
        this.id = id;
        this.hireYear = hireYear;
        this.salary = salary;
    }

    private double salary;

    @Override
    public String getName() {
        return name;
    }

    public int getHireYear() {
        return hireYear;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name: " + name + '\'' +
                ", id=" + id +
                ", hireYear=" + hireYear +
                ", salary=" + salary +
                '}';
    }

    public abstract double calculateSalary();

    public void adjustSalaryByExperience() {

    }
}
