package math_lib.function;

import java.util.function.BinaryOperator;

/**
* Must satisfy a = foo.apply(a, a)
*/
interface Idempotent<T> extends BinaryOperator<T> {

}
