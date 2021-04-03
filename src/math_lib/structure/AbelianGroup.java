package math_lib.structure;

import math_lib.function.Associative;
import math_lib.function.Commutative;

public interface AbelianGroup<U, T, B extends Associative<T> & Commutative<T>> extends Group<U, T, B>{

}
