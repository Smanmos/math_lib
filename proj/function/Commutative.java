package math_lib.proj.function;

import java.util.function.BinaryOperator;

/**
* Functions T foo(T) of this class must satisfy the commutative property:
* a.foo(b) == b.foo(a) for all valid values of a and b
*/
public interface Commutative<T> extends BinaryOperator<T> {

}
