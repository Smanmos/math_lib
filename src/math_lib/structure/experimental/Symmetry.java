package math_lib.structure.experimental;

public class Symmetry {
    private final int length;
    public class Permutation {
        private final int[] perm;

        public Permutation(int[] perm){
            if (perm.length != length){
                throw new ArithmeticException("Wrong permutation length");
            }
            this.perm = perm;
        }

        private static void verify(int[] perm){
            if (perm == null || perm.length != length){
                throw new ArithmeticException("Wrong permutation length");
            }
        }
    }
}
