/*
this class calculates the the constant p using monte carlo simulation
 */

import acm.program.*;

public class CalculateP extends ConsoleProgram {

    // runs the program
    public void run() {
        throwDarts(10000);
        calculateP();
    }
    // gets random position of dart
    private void throwDarts(int count) {
        for (int i = 0; i < count; i++ ) {
            double x = throwDart.getRandomPosition(max, min);
            double y = throwDart.getRandomPosition(max, min);
            if (dartIsInCircule(x,y)) dartsInCircle += 1;
            dartsInSquare += 1;
        }
    }
    //defines if dart is in circle
    private boolean dartIsInCircule(double x , double y) {
        if ((x * x) + (y * y) <= 1) return true;
        else return false;
    }

    //calculates p
    private void calculateP() {
        double p = (dartsInCircle / dartsInSquare) * 4;
        println(dartsInCircle);
        println(dartsInSquare);
        println(p);
    }

    // instance variables
    private double dartsInCircle = 0;
    private double dartsInSquare = 0;

    // maximum and minimum cordinates of x or y in
    int max = 1;
    int min = -1;

    private ThrowDart throwDart = new ThrowDart();
}
