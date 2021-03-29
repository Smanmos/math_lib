package math_lib;

import function.Associative;
import math_lib.proj.structure.Semigroup;

/**
* Interface for monoids with elements in class T
* Monoids must
*/
public interface Monoid<T, B extends Associative<T>> extends Semigroup<T, B>{
    public T identity();
}
