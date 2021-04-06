package math_lib.base;

import java.math.BigInteger;

public class BaseModuloInteger {
    private BigInteger base;
    private BigInteger modulo;

    class StrictAdd implements Associative<BaseModuloInteger>, Commutative<BaseModuloInteger> {
        @Override
        public BaseModuloInteger apply(BaseModuloInteger augend, BaseModuloInteger addend){
            if (!augend.modulo.equals(addend.modulo)){
                throw new ArithmeticException("Different modulos: ", augend.);
            }
            return new BaseModuloInteger(augend.base.add(addend.base), augend.modulo);
        }
    }

    class StrictMultiply implements Associative<BaseModuloInteger>, Commutative<BaseModuloInteger> {
        @Override
        public BaseModuloInteger apply(BaseModuloInteger multiplicand, BaseModuloInteger multiplier){
            if (!multiplicand.modulo.equals(multiplier.modulo)){
                throw new ArithmeticException("Different modulos");
            }
            return new BaseModuloInteger(multiplicand.base.add(multiplier.base), multiplicand.modulo);
        }
    }

    public BaseModuloInteger(BigInteger base, BigInteger modulo) {
        if (modulo.compareTo(BigInteger.ZERO) < 0){
            modulo = modulo.negate();
        }
        if (modulo.compareTo(BigInteger.ZERO) == 0){
            base = base.mod(modulo);
        }
        this.base = base;
        this.modulo = modulo;
    }
    @Override
    public String toString(){
        return "(" + base.toString() + " " + modulo.toString() + "Z)";
    }
}
