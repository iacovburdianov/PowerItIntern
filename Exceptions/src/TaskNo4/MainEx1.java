package TaskNo4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Admin on 4/13/2023
 *
 * @author : Admin
 * @date : 4/13/2023
 * @project : Exceptions
 */
public class MainEx1 implements Calculator {
    @Override
    public double adding(double d1, double d2) throws OverflowException, UnderflowException {
        double sum = d1 + d2;
        if (sum == Double.POSITIVE_INFINITY){
            throw new OverflowException("Overflow Exception");
        }
        if (sum == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("Underflow Excception");
        }
        return sum;
    }

    @Override
    public double dividing(double d1, double d2){
        return d1 / d2;
    }

    @Override
    public double average(List<Double> collection) throws NullParameterException {
        double average = collection.stream().mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();
        return average;
    }
}
