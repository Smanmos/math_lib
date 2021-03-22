/**
* Interface for semigroups with elements in class T
* Semigroups must obey the following property:
* Associativity: a.foo(b).foo(c) == a.foo(b.foo(c))
* Serves as a
*/
public abstract class Semigroup<T, ? implements Associative<T> > C{
    public Monoid<T, ? implements Associative<T>> multiply();
}
