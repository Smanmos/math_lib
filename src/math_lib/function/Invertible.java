package math_lib.function;

public interface Invertible<T> extends Unital<T> {
    public T inverse(T t);
}
