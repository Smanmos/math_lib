import java.math.BigInteger;

public class Integer {
    BigInteger value;
    public Integer(BigInteger value){
        this.value = value;
    }
    public Integer(long value){
        this.value = new BigInteger(value);
    }
    public Integer(int value){
        this.value = new BigInteger((long)value);
    }
}
