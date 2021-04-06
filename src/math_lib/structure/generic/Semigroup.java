package math_lib.structure.generic;

import math_lib.function.Associative;

/**
* Interface for semigroups with elements in class T
* Semigroups must obey the following property:
* Associativity: a.foo(b).foo(c) == a.foo(b.foo(c))
* Serves as a
*/
public interface Semigroup<U, T, B extends Associative<T> > {
    public U dot(U t);
}
