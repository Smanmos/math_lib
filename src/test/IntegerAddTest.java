package test;

import math_lib.structure.IntegerAdd;

class IntegerAddTest {

    public static void main(String[] args){
        IntegerAdd a = new IntegerAdd(3);
        IntegerAdd b = new IntegerAdd(4);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        IntegerAdd c = a.plus(b);
        System.out.println("a + b = " + c);
        IntegerAdd d = b.plus(a);
        System.out.println("b + a = " + d);
        IntegerAdd id = a.identity();
        System.out.println("id = " + id);
        System.out.println("a + id = " + a.plus(id));
        System.out.println("id + a = " + id.plus(a));
        System.out.println("-a = " + a.inverse());
    }
}
