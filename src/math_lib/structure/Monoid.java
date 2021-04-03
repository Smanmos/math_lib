package math_lib.structure;

import math_lib.function.Associative;
import math_lib.structure.Semigroup;

/**
* Interface for monoids with elements in class T
* Monoids must
*/
public interface Monoid<U, T, B extends Associative<T>> extends Semigroup<U, T, B>{
    public U identity();
}
