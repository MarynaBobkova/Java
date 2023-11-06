package Employee;
//Подкласс BaseEmployee, представляющий менеджера.
//Содержит специфические поля, такие как baseSalary и numberOfProjects, и реализует метод calculateSalary().

public class Manager extends BaseEmployee{
    double baseSalary;
    int numberOfProjects;

    public Manager(String name, int id, int hireYear, double salary, double baseSalary, int numberOfProjects) {
        super(name, id, hireYear, salary);
        this.baseSalary = baseSalary;
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * numberOfProjects;
    }

    @Override
    public String toString() {
        return "Manager " +
                "base salary: " + baseSalary +
                ", number of Projects= " + numberOfProjects +
                '}';
    }
}
