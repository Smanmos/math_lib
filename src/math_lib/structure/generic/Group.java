package math_lib.structure.generic;

import math_lib.function.Invertible;
import math_lib.function.Associative;

/**
* Interface for groups with elements in class T
*/
public interface Group<U, T, B extends Invertible<T> & Associative<T>> extends Monoid<U, T, B> {
    public U inverse();
}
