package math_lib.function;

import java.util.function.BinaryOperator;

/**
* Unital functions must have a unit element e = foo.identity() with the following property:
* For all T t:
* foo.apply(e, t) == foo.apply(t, e) == t
*/

public interface Unital<T> extends BinaryOperator<T> {
    public T identity();
}
