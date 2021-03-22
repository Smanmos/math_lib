import java.util.function.BinaryOperator;

/**
* Functions T foo(T) of this class must satisfy the commutative property:
* foo.apply(a, foo.apply(b, c)) == foo.apply(foo.apply(a, b), c)
*/
public interface Associative<T> extends BinaryOperator<T> {

}
