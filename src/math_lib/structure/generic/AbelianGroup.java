package math_lib.structure.generic;

import math_lib.function.Associative;
import math_lib.function.Commutative;
import math_lib.function.Invertible;

public interface AbelianGroup<U, T, B extends Commutative<T> & Invertible<T> & Associative<T> > extends Group<U, T, B>{

}
