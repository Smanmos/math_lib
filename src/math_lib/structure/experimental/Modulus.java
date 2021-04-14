package math_lib.structure.experimental;

import java.lang.ClassCastException;

public class Modulus {
    final int modulus;

    public Modulus(int m){
        if (m < 0){
            m = -m;
        }
        modulus = m;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        else if (!(obj instanceof Modulus)){
            return false;
        }
        else {
            return this.modulus == ((Modulus)obj).modulus;
        }
    }

    @Override
    public String toString(){
        return "Z/" + modulus + "Z";
    }

    public class Residue {
        final int residue;
        public Residue(int r){
            if (modulus != 0){
                r = r % modulus;
            }
            if (r < 0){
                r += modulus;
            }
            residue = r;
        }

        public Residue add(Residue that){
            if (!this.getOuter().equals(that.getOuter())){
                throw new ClassCastException("class Modulus[" + that.getOuter() + "].Residue cannot be cast to class Modulus[" + this.getOuter() + "].Residue");
            }
            return new Residue(this.residue + that.residue);
        }

        public Residue multiply(Residue that){
            if (!this.getOuter().equals(that.getOuter())){
                throw new ClassCastException("class Modulus[" + that.getOuter() + "].Residue cannot be cast to class Modulus[" + this.getOuter() + "].Residue");
            }
            return new Residue(this.residue * that.residue);
        }

        private Modulus getOuter(){
            return Modulus.this;
        }

        @Override
        public String toString(){
            return "(" + residue + " + " + modulus + "Z)";
        }
    }
}
