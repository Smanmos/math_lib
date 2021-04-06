package math_lib.util;

import math_lib.function.*;

/**
* Performing operations on Integer is not recommended due to potential to overflow
* However, it may be used if speed is a necessity and
*/
public class IntegerUtil {
    public static class Add implements Associative<Integer>, Commutative<Integer>, Invertible<Integer> {
        private static Add instance;

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

        public static Add of(){
            if (instance == null){
                instance = new Add();
            }
            return instance;
        }
    }

    public static class Multiply implements Associative<Integer>, Commutative<Integer>, Unital<Integer>, Absorbing<Integer> {
        private static Multiply instance;
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

        public static Multiply of(){
            if (instance == null){
                instance = new Multiply();
            }
            return instance;
        }
    }

    public static class Min implements Associative<Integer>, Commutative<Integer>, Idempotent<Integer> {
        private static Min instance;

        @Override
        public Integer apply(Integer a, Integer b){
            if (a < b){
                return a;
            }
            else {
                return b;
            }
        }

        public static Min of(){
            if (instance == null){
                instance = new Min();
            }
            return instance;
        }
    }

    public static class Max implements Associative<Integer>, Commutative<Integer>, Idempotent<Integer> {
        private static Max instance;

        @Override
        public Integer apply(Integer a, Integer b){
            if (a > b){
                return a;
            }
            else {
                return b;
            }
        }

        public static Max of(){
            if (instance == null){
                instance = new Max();
            }
            return instance;
        }
    }
}
