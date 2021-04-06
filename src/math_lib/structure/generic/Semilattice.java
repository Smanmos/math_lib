package math_lib.structure.generic;

import math_lib.function.Associative;
import math_lib.function.Commutative;
import math_lib.function.Idempotent;

public interface Semilattice<U, T, B extends Associative<T> & Commutative<T> & Idempotent<T>> {
    public U dot(U that);
}
