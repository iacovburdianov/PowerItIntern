package TaskNo4;

import java.util.Collection;
import java.util.List;

public interface Calculator {
    double adding(double d1, double d2) throws OverflowException, UnderflowException;
    double dividing(double d1, double d2);
    double average(List<Double> collection) throws NullParameterException;
}
