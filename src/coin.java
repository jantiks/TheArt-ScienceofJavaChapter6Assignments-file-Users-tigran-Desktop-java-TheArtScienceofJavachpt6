/*
coin class randomly flips coin and returnes head or tails
 */
import acm.util.*;
public class coin {

    //constructor
    public coin() {
        rgen = new RandomGenerator();
    }

    //flips coin
    public String flipCoin() {
        return rgen.nextBoolean() ? "Head" : "Tails";
    }

    //instance variables
    private RandomGenerator rgen;
}
