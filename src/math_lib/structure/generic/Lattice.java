package math_lib.structure.generic;

public interface Lattice<L, T, M extends Semilattice<M, T, ?>, J extends Semilattice<J, T, ?>> {
    public L meet(L l);
    public L join(L l);
    public M toMeetSemilattice();
    public J toJoinSemilattice();
}
