package math_lib.structure.generic;

public interface AnnihilatingMonoid<U, T, B extends Absorbing<T> & Associative<T> & Unital<T> > {
    public U identity();
    public U annihilator();
    public U dot();
}
