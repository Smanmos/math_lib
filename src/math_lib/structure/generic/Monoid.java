package math_lib.structure.generic;

import math_lib.function.Unital;
import math_lib.function.Associative;
import math_lib.structure.generic.Semigroup;

/**
* Interface for monoids with elements in class T
* Monoids must
*/
public interface Monoid<U, T, B extends Unital<T> & Associative<T> > extends Semigroup<U, T, B>{
    public U identity();
}
