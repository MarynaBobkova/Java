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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Developer developer = (Developer) object;

        if (Double.compare(hourlyRate, developer.hourlyRate) != 0) return false;
        return hoursWorked == developer.hoursWorked;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(hourlyRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + hoursWorked;
        return result;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", hireYear=" + hireYear +
                ", salary=" + salary +
                '}';
    }
}
