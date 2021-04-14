package test;

import math_lib.structure.experimental.Modulus;

public class ModulusTest {

    public static void main(String[] args){
        Modulus mod = new Modulus(7);
        Modulus.Residue a = mod.new Residue(3);
        Modulus.Residue b = mod.new Residue(9);
        System.out.println("mod = " + mod);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + a.add(b));
        System.out.println("a * b = " + a.multiply(b));
        Modulus other = new Modulus(5);
        Modulus.Residue c = other.new Residue(-1);
        System.out.println("c = " + c);
        System.out.println("a + c = " + a.add(c));
        System.out.println("c + a = " + c.add(a));
    }
}
