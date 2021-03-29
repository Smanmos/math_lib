package math_lib.structure;

import math_lib.function.Associative;

public class IntegerAdd implements Semigroup<Integer, Integer.Add> {
    private Integer value;

    public IntegerAdd(int value) {
        this.value = new Integer(value);
    }

    public IntegerAdd plus(IntegerAdd that){
        return new IntegerAdd(this.value.value.add(that.value.value));
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
