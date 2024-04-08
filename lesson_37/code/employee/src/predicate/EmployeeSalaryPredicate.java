package predicate;

import entity.BaseEmployee;

import java.util.function.Predicate;

/**
 * @author Andrej Reutow
 * created on 24.10.2023
 */
public class EmployeeSalaryPredicate implements Predicate<BaseEmployee> {

    private final int fromSalary;
    private final int toSalary;

    public EmployeeSalaryPredicate(int fromSalary, int toSalary) {
        this.fromSalary = fromSalary;
        this.toSalary = toSalary;
    }

    @Override
    public boolean test(BaseEmployee baseEmployee) {
        return baseEmployee.calculateSalary() >= fromSalary && baseEmployee.calculateSalary() <= toSalary;
    }
}
