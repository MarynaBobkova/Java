package entity;

// Класс Developer
public class Developer extends BaseEmployee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked, int hireYear) {
        super(name, hireYear);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", hireYear=" + hireYear +
                '}';
    }
}
