package task5;

import java.util.Objects;

public class Employee {
    private String name;
    private String posititon;
    private double salary;

    public Employee(String name, String posititon, double salary) {
        this.name = name;
        this.posititon = posititon;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosititon() {
        return posititon;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;

        if (Double.compare(salary, employee.salary) != 0) return false;
        if (!Objects.equals(name, employee.name)) return false;
        return Objects.equals(posititon, employee.posititon);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (posititon != null ? posititon.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", posititon='" + posititon + '\'' +
                ", salary=" + salary +
                '}';
    }
}
