package test;

import math_lib.structure.algebraic.MinMaxInteger;

public class MinMaxIntegerTest {

    public static void main(String[] args){
        MinMaxInteger a = new MinMaxInteger(4);
        MinMaxInteger b = new MinMaxInteger(-3);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("min(a, b) = " + a.meet(b));
        System.out.println("max(a, b) = " + a.join(b));
        System.out.println("Absorbtion law: min(a, max(a, b)) = " + a.meet(a.join(b)));
    }
}
