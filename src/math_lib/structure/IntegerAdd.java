package math_lib.structure;

import math_lib.base.BaseInteger;
import math_lib.structure.AbelianGroup;
import java.math.BigInteger;

public class IntegerAdd implements AbelianGroup<IntegerAdd, BaseInteger, BaseInteger.Add> {
    BaseInteger value;

    public IntegerAdd(int value) {
        this.value = new BaseInteger(value);
    }

    public IntegerAdd(long value) {
        this.value = new BaseInteger(value);
    }

    public IntegerAdd(BaseInteger value){
        this.value = value;
    }

    public IntegerAdd(BigInteger value){
        this.value = new BaseInteger(value);
    }

    public IntegerAdd plus(IntegerAdd that){
        return new IntegerAdd(this.value.get().add(that.value.get()));
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
        return new IntegerAdd(value.get().negate());
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
