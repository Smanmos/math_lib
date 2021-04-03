package math_lib.function;

import java.util.function.BinaryOperator;

/**
* Absorbing functions must have a unit element a = foo.absorbing() with the following property:
* For all T t:
* foo.apply(a, t) == foo.apply(t, a) == a
*/

public interface Absorbing<T> extends BinaryOperator<T> {
    public T absorber();
}
