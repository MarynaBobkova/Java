package predicate;

import entity.BaseEmployee;

import java.util.function.Predicate;

/**
 * @author Andrej Reutow
 * created on 24.10.2023
 */
public class EmployeeHireYearPredicate implements Predicate<BaseEmployee> {

    private final int fromHireYear;
    private final int toHireYear;

    public EmployeeHireYearPredicate(int fromHireYear, int toHireYear) {
        this.fromHireYear = fromHireYear;
        this.toHireYear = toHireYear;
    }

    @Override
    public boolean test(BaseEmployee baseEmployee) {
        //copy[i].getHireYear() >= fromHireYear && copy[i].getHireYear() <= toHireYear
        return baseEmployee.getHireYear() >= fromHireYear && baseEmployee.getHireYear() <= toHireYear;
    }
}
