package math_lib.structure;

import java.math.BigInteger;
import math_lib.function.Associative;

public class BaseInteger {
    private BigInteger value;
    class Add implements Associative<BaseInteger> {
        @Override
        public BaseInteger apply(BaseInteger addend, BaseInteger augend) {
            return new BaseInteger(addend.value.add(augend.value));
        }
    }
    class Multiply implements Associative<BaseInteger> {
        @Override
        public BaseInteger apply(BaseInteger multiplicand, BaseInteger multiplier) {
            return new BaseInteger(multiplicand.value.multiply(multiplier.value()));
        }
    }
    class Min implements Associative<BaseInteger>{
        @Override
        public BaseInteger apply(BaseInteger arg1, BaseInteger arg2){
            return new BaseInteger(arg1.value.min(arg2.value));
        }
    }
    public BaseInteger(BigInteger value){
        this.value = value;
    }
    public BaseInteger(long value){
        this.value = new BigInteger(value);
    }
    public BaseInteger(int value){
        this.value = new BigInteger((long)value);
    }
    @Override
    public String toString(){
        return value.toString();
    }
}
