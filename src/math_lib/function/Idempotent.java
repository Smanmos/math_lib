package math_lib.function;

import java.util.function.BinaryOperator;

/**
* Idempotent functions T foo(T, T) must satisfy the idempotent property:
* For element T t:
* foo.apply(t, t) == t
*/
interface Idempotent<T> extends BinaryOperator<T> {

}
