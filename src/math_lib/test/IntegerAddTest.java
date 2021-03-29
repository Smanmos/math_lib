package math_lib.test;

import structure.IntegerAdd;

class IntegerAddTest {

    public static void main(String[] args){
        IntegerAdd a = new IntegerAdd(3);
        IntegerAdd b = new IntegerAdd(4);
        System.out.println(a);
        System.out.println(b);
        IntegerAdd c = a.plus(b);
        System.out.println(c);
    }
}
