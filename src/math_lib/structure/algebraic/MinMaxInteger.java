package math_lib.structure.algebraic;

import math_lib.structure.generic.Lattice;
import math_lib.structure.generic.Semilattice;
import math_lib.util.IntegerUtil;

class MinInteger implements Semilattice<MinInteger,Integer, IntegerUtil.Min> {
    private int value;

    public MinInteger(Integer value){
        this.value = value;
    }

    @Override
    public MinInteger dot(MinInteger that){
        if (this.value < that.value){
            return new MinInteger(this.value);
        }
        else {
            return new MinInteger(that.value);
        }
    }
}

class MaxInteger implements Semilattice<MaxInteger,Integer, IntegerUtil.Max> {
    private int value;

    public MaxInteger(Integer value){
        this.value = value;
    }

    @Override
    public MaxInteger dot(MaxInteger that){
        if (this.value < that.value){
            return new MaxInteger(this.value);
        }
        else {
            return new MaxInteger(that.value);
        }
    }
}

public class MinMaxInteger implements Lattice<MinMaxInteger, Integer, MinInteger, MaxInteger> {
    private int value;

    public MinMaxInteger(Integer value){
        this.value = value;
    }

    @Override
    public MinMaxInteger meet(MinMaxInteger that){
        if (this.value < that.value){
            return new MinMaxInteger(this.value);
        }
        else {
            return new MinMaxInteger(that.value);
        }
    }

    @Override
    public MinMaxInteger join(MinMaxInteger that){
        if (this.value > that.value){
            return new MinMaxInteger(this.value);
        }
        else {
            return new MinMaxInteger(that.value);
        }
    }

    @Override
    public MinInteger toMeetSemilattice(){
        return new MinInteger(this.value);
    }

    @Override
    public MaxInteger toJoinSemilattice(){
        return new MaxInteger(this.value);
    }

    @Override
    public String toString(){
        return "" + value;
    }
}
