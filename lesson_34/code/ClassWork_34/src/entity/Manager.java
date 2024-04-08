package entity;

// Класс Manager
public class Manager extends BaseEmployee {
    private double baseSalary;
    private int numberOfProjects;

    public Manager(String name, double baseSalary, int numberOfProjects, int hireYear) {
        super(name, hireYear);
        this.baseSalary = baseSalary;
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (numberOfProjects * 1000);
    }


    @Override
    public String toString() {
        return "Manager{" +
                "baseSalary=" + baseSalary +
                ", numberOfProjects=" + numberOfProjects +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", hireYear=" + hireYear +
                '}';
    }
}
