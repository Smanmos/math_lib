public class ModuloInteger {
    private BigInteger base;
    private BigInteger modulo;

    public ModuloInteger(BigInteger base, BigInteger modulo) {
        this.base = base;
        this.modulo = modulo;
    }
    @Override
    public String toString(){
        return "(" + base.toString() + " " + modulo.toString() + "Z)";
    }
}
