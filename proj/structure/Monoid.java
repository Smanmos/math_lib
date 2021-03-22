/**
* Interface for monoids with elements in class T
* Monoids must
*/
public abstract class Monoid<T, F implements Associative<T>>{
    T value;
    public T dot(T other){
        return F(this, other);
    }
}
