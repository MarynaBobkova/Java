package entity;

import java.util.Calendar;

// Абстрактный класс BaseEmployee
public abstract class BaseEmployee implements Employee, Comparable<BaseEmployee> {
    protected String name;
    protected Integer id; // null
    protected int hireYear;

    public BaseEmployee(String name, int hireYear) {
        this.name = name;
        this.hireYear = hireYear;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public abstract double calculateSalary();

    @Override
    public int compareTo(BaseEmployee o) {
        return this.hireYear - o.hireYear;
    }

    public int getHireYear() {
        return hireYear;
    }
}
