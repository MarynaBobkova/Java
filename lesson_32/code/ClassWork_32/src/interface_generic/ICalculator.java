package interface_generic;

/**
 * @author Andrej Reutow
 * created on 19.10.2023
 */
public interface ICalculator<T, R> {

    R add(T value1, T value2);
}
