package entity;

// Класс Salesperson
public class Salesperson extends BaseEmployee {
    private double baseSalary;
    private int numberOfDeals;

    public Salesperson(String name, double baseSalary, int numberOfDeals, int hireYear) {
        super(name, hireYear);
        this.baseSalary = baseSalary;
        this.numberOfDeals = numberOfDeals;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (numberOfDeals * 200);
    }

    @Override
    public String toString() {
        return "Salesperson{" +
                "baseSalary=" + baseSalary +
                ", numberOfDeals=" + numberOfDeals +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", hireYear=" + hireYear +
                ", salary=" + salary +
                '}';
    }
}
