package math_lib.structure.algebraic;

public class PrimeField implements Ring<PrimeField, ModuloInteger, ModuloIntegerUtil.StrictAdd, ModuloInteger.StictMultiply> {
    private int residue;
    private int modulus;
}
