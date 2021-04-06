package math_lib.structure.generic;

public interface Equivalence<T> extends T {
    public boolean equivalentTo(T that);
}
