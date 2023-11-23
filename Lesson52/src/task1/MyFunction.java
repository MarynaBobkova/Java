package task1;

import java.util.function.Function;

public class MyFunction implements Function<Double, Long> {
    @Override
    public Long apply(Double aDouble) {
        return Math.round(aDouble);
    }

}
