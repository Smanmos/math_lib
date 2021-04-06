package math_lib.function;

/**
* NearInvertible functions must satisfy the following identity:
* For all T t != foo.absorber():
* foo.apply(t, foo.inverse(t)) == foo.apply(foo.inverse(t), t) == foo.identity()
*
* Note that this is unsatisfiable for this absorber.
* As such, a function cannot be both Invertible and NearInvertible
*/

public interface NearInvertible<T> extends Unital<T>, Absorbing<T> {
    public T inverse(T t);
}
