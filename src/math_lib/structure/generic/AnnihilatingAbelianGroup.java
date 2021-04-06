package math_lib.structure.generic;

public interface AnnihilatingGroup<U, T, B extends Commutative<T> & NearInvertible<T>>
        extends AnnihilatingMonoid<U, T, B> {
    public U inverse();
}
