package math_lib.base;

public class ModuloInteger {
    public final int value;
    public final int modulus;

    public ModuloInteger(int value, int modulus){
        if (modulus < 0){
            modulus = -modulus;
        }
        if (value < 0){
            value = -value;
        }
        if (modulus != 0){
            value %= modulus;
        }
        this.value = value;
        this.modulus = modulus;
    }

    @Override
    public String toString(){
        return "(" + value + " + " + modulus + "Z)";
    }
}
