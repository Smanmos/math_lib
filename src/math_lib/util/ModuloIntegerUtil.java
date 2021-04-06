package math_lib.base;

public class ModuloIntegerUtil {
    public class StrictAdd implements Associative<ModuloInteger>, Commutative<ModuloInteger>,
            Invertible<ModuloInteger> {
        @Override
        public ModuloInteger apply(ModuloInteger augend, ModuloInteger addend) {
            if (augend.modulus != addend.modulus){
                throw new IllegalArgumentException("Different moduli: " + augend.modulus + ", " + addend.modulus);
            }
            return new ModuloInteger(augend.value + addend.value, augend.modulus);
        }

        @Override
        public ModuloInteger identity(){
            return new ModuloInteger(0, 0);
        }

        @Override
        public ModuloInteger inverse(ModuloInteger num){
            return new ModuloInteger(-num.value, num.modulo);
        }
    }

    public class StrictMultiply implements Associative<ModuloInteger>, Commutative<ModuloInteger>,
            Invertible<ModuloInteger>, Absorbing<ModuloInteger> {
        @Override
        public ModuloInteger apply(ModuloInteger augend, ModuloInteger addend) {
            if (augend.modulus != addend.modulus){
                throw new IllegalArgumentException("Different moduli: " + augend.modulus + ", " + addend.modulus);
            }
            return new ModuloInteger(augend.value * addend.value, augend.modulus);
        }

        @Override
        public ModuloInteger identity(){
            return new ModuloInteger(1, 0);
        }

        @Override
        public ModuloInteger inverse(ModuloInteger num){
            int inv = MathUtil.extendedEuclid(num.value, num.modulus).x;
            return new ModuloInteger(inv, num.modulus);
        }

        @Override
        public ModuloInteger annihilator(){
            return new ModuloInteger(0, 0);
        }

    }
}
