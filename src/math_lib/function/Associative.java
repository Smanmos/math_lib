package math_lib.function;

import java.util.function.BinaryOperator;

/**
* Associative functions T foo(T, T) must satisfy the associative property on elements T a, b, c:
* foo.apply(a, foo.apply(b, c)) == foo.apply(foo.apply(a, b), c)
*/
public interface Associative<T> extends BinaryOperator<T> {

}
