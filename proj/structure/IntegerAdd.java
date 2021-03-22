import function.Associative;

private class Add implements Associative<Integer> {
    @Override
    public Integer apply(Integer augend, Integer addend){
        return new Integer(augend.value.add(addend.value));
    }
}

public IntegerAdd extends Monoid<Integer, Add> {

}
