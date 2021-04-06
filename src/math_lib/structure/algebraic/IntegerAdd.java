package math_lib.structure;

import math_lib.base.BaseInteger;
import math_lib.structure.generic.AbelianGroup;
import math_lib.util.IntegerUtil;
import java.math.BigInteger;

public class IntegerAdd implements AbelianGroup<IntegerAdd, Integer, IntegerUtil.Add> {
    private int value;

    public IntegerAdd(int value) {
        this.value = value;
    }

    public IntegerAdd(IntegerAdd that){
        this.value = that.value;
    }

    public int get(){
        return value;
    }

    public IntegerAdd plus(IntegerAdd that){
        return new IntegerAdd(this.value + that.value);
    }

    @Override
    public IntegerAdd dot(IntegerAdd that){
        return this.plus(that);
    }

    @Override
    public IntegerAdd identity(){
        return new IntegerAdd(0);
    }

    @Override
    public IntegerAdd inverse(){
        return new IntegerAdd(-value);
    }

    @Override
    public String toString(){
        return "" + value;
    }
}
