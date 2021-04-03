package math_lib.base;

import java.math.BigInteger;
import math_lib.function.Associative;
import math_lib.function.Commutative;

public class BaseInteger {
    BigInteger value;
    public class Add implements Associative<BaseInteger>, Commutative<BaseInteger> {
        @Override
        public BaseInteger apply(BaseInteger addend, BaseInteger augend) {
            return new BaseInteger(addend.value.add(augend.value));
        }
    }
    class Multiply implements Associative<BaseInteger> {
        @Override
        public BaseInteger apply(BaseInteger multiplicand, BaseInteger multiplier) {
            return new BaseInteger(multiplicand.value.multiply(multiplier.value));
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
        this.value = BigInteger.valueOf(value);
    }
    public BaseInteger(int value){
        this((long)value);
    }

    public BigInteger get(){
        return value;
    }
    @Override
    public String toString(){
        return value.toString();
    }
}
