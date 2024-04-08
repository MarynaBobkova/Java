package comparators;

import entity.BaseEmployee;

import java.util.Comparator;

/**
 * @author Andrej Reutow
 * created on 23.10.2023
 */
public class EmployeeHireYearComparator implements Comparator<BaseEmployee> {

    @Override
    public int compare(BaseEmployee o1, BaseEmployee o2) {
        return o1.getHireYear() - o2.getHireYear();
    }
}
