package math_lib.function;

import java.util.function.BinaryOperator;

/**
* Commutative functions T foo(T, T) must satisfy the commutative property:
* For elements T a, b:
* foo.apply(a, b) == foo.apply(b, a)
*/
public interface Commutative<T> extends BinaryOperator<T> {

}
