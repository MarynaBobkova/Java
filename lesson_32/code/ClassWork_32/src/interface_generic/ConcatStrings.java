package interface_generic;

import comparator.entity.Car;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class ConcatStrings implements ICalculator<String, String> {
    @Override
    public String add(String value1, String value2) {
        return value1 + value2;
    }


}
