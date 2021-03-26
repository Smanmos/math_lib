package math_lib;

import function.Associative;

/**
* Interface for semigroups with elements in class T
* Semigroups must obey the following property:
* Associativity: a.foo(b).foo(c) == a.foo(b.foo(c))
* Serves as a
*/
public interface Semigroup<T, B extends Associative<T> > {
    public T dot(T t1, T t2);
}
