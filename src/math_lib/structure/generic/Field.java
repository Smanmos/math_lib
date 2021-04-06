package math_lib.structure.generic;

public interface Field <F, T, P, M extends AnnihilatingAbelianGroup<T>> extends Ring<F, T, P, M>{
    public T plus(T t);
    public T negate();
    public T plusIdentity();
    public T dot(T t);
    public T inverse();
    public T dotIdentity();
}
