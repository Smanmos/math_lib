package math_lib.base;

public class ModuloInteger {
    public final int residue;
    public final int modulus;

    public ModuloInteger(int residue, int modulus){
        if (modulus < 0){
            modulus = -modulus;
        }
        if (residue < 0){
            residue = -residue;
        }
        if (modulus != 0){
            residue %= modulus;
        }
        this.residue = residue;
        this.modulus = modulus;
    }

    @Override
    public String toString(){
        return "(" + residue + " + " + modulus + "Z)";
    }
}
