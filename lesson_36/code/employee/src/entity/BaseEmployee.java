package entity;

import java.util.Calendar;
import java.util.Objects;

// Абстрактный класс BaseEmployee
public abstract class BaseEmployee implements Employee {
    protected String name;
    protected Integer id; // null
    protected int hireYear;
    protected double salary;

    public BaseEmployee(String name, int hireYear) {
        this.name = name;
        this.hireYear = hireYear;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public int getHireYear() {
        return hireYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void adjustSalaryByExperience(int minExperience, int maxExperience, double percentage) {
        // todo
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseEmployee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", hireYear=").append(hireYear);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString() + " ";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        BaseEmployee that = (BaseEmployee) object;

        if (hireYear != that.hireYear) return false;
        if (Double.compare(salary, that.salary) != 0) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + hireYear;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
