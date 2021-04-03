package math_lib;

public interface AnnihilatingGroup<U, T, B extends Associative<T>> extends Group<U, B, T> {
    public U annihilator();
}
