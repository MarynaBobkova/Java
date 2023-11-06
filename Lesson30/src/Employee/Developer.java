package Employee;
//Подкласс BaseEmployee, представляющий разработчика.
//Содержит специфические поля, такие как hourlyRate и hoursWorked, и реализует метод calculateSalary().

public class Developer extends BaseEmployee  {
    int hourlyRate;
    int hoursWorked;

    public Developer(String name, int id, int hireYear, double salary, int hourlyRate, int hoursWorked) {
        super(name, id, hireYear, salary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "Developer " +
                "hourly rate: " + hourlyRate +
                ", hours worked= " + hoursWorked +
                '}';
    }
}
