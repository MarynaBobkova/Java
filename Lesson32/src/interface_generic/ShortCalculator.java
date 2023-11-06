package interface_generic;


public class ShortCalculator implements ICalculator<Short, Integer> {
    @Override
    public Integer add(Short value1, Short value2) {
        return value1 + value2;
    }
}