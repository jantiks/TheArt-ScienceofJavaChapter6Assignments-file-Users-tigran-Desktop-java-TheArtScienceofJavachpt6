/*
randomly throws dart at given position
 */

import acm.util.*;

public class ThrowDart {

    // constructor
    public ThrowDart() {
        rgen = new RandomGenerator();
    }
    // returns random int
    public double getRandomPosition(int max , int min) {
        return rgen.nextDouble(max,min);
    }

    //instance variables
    private RandomGenerator rgen;
}
