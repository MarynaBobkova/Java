package interface_generic;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public class DoubleCalculator implements ICalculator<Double, Integer> {


    @Override
    public Integer add(Double value1, Double value2) {
        return (int) (value1 + value1);
    }
}
