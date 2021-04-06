package math_lib.structure.generic;

public interface Ring<U, T, P extends AbelianGroup<T>, M extends AnnihilatingMonoid<T>> {
    public default T plus(T t);
    public T negate();
    public T plusIdentity();
    public T dot(T t);
    public T dotIdentity();
}
