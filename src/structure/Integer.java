package math_lib.structure;

import java.math.BigInteger;

public class Integer {
    private BigInteger value;
    class Add implements Associative<Integer> {
        @Override
        public Integer apply(Integer addend, Integer augend) {
            return new Integer(addend.value.add(augend.value));
        }
    }
    class Multiply implements Associative<Integer> {
        @Override
        public Integer apply(Integer multiplicand, Integer multiplier) {
            return new Integer(multiplicand.value.multiply(multiplier.value()));
        }
    }
    class Min implements Associative<Integer>{
        @Override
        public Integer apply(Integer arg1, Integer arg2){
            return new Integer(arg1.value.min(arg2.value));
        }
    }
    public Integer(BigInteger value){
        this.value = value;
    }
    public Integer(long value){
        this.value = new BigInteger(value);
    }
    public Integer(int value){
        this.value = new BigInteger((long)value);
    }
    @Override
    public String toString(){
        return value.toString();
    }
}
