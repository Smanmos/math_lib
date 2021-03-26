import java.math.BigInteger;

public class Integer {
    private BigInteger value;
    class Add implements Associative<Integer> {
        @Override
        public T apply(T addend, T augend) {
            return new Integer(addend.value.add(augend.value));
        }
    }
    class Multiply implements Associative<Integer> {
        @Override
        public T apply(T addend, T augend) {
            return new Integer(addend.value.add(augend.value));
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
