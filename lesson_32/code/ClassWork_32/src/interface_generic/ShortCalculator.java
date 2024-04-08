package interface_generic;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class ShortCalculator implements ICalculator<Short, Integer> {
    @Override
    public Integer add(Short value1, Short value2) {
        return value1 + value2;
    }
}
