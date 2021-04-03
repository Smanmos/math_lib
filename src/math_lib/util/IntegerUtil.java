package math_lib.util;

import math_lib.function.*;

public class IntegerUtil {
    public class IntegerAdd implements Associative<Integer>, Commutative<Integer>, Invertible<Integer> {
        @Override
        public Integer apply(Integer augend, Integer addend){
            return augend + addend;
        }

        @Override
        public Integer identity(){
            return 0;
        }

        @Override
        public Integer inverse(Integer num){
            return -num;
        }

        public static IntegerAdd of(){
            return new IntegerAdd();
        }
    }

    public class IntegerMultiply implements Associative<Integer>, Commutative<Integer>, Unital<Integer>, Absorbing<Integer> {
        @Override
        public Integer apply(Integer multiplier, Integer multiplicand){
            return multiplier * multiplicand;
        }

        @Override
        public Integer identity(){
            return 1;
        }

        @Override
        public Integer absorber(){
            return 0;
        }

        public static void IntegerMultiply of(){
            return new IntegerMultiply();
        }
    }
}
