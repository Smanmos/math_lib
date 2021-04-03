package math_lib.structure;

import math_lib.function.Associative;

/**
* Interface for groups with elements in class T
*/
public interface Group<U, T, B extends Associative<T>> extends Monoid<U, T, B> {
    public U inverse();
}
