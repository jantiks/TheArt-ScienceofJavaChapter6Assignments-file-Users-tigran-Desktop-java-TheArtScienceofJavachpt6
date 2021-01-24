/*
generates simple equation
 */

import acm.util.*;

public class CalculatioGenerator {
    // constructor
    public CalculatioGenerator() {
        rgen = new RandomGenerator();
    }

    //returns first number
    public int getFirstNumber() {
        return firstNumber;
    }
    //returns second number
    public int getSecondNumber() {
        return secondNumber;
    }
    // returns equation
    public String getEquation() {
        return equation;
    }


    //makes numbers
    public void makeEquation() {
        if (hasMinusSign()) {
            firstNumber = rgen.nextInt(0,20);
            secondNumber = rgen.nextInt(-firstNumber , 0);
            equation = Integer.toString(firstNumber) + " - " + Integer.toString( -1 * secondNumber);
        } else {
            firstNumber = rgen.nextInt(0,20);
            secondNumber = rgen.nextInt(0,20 - firstNumber);
            equation = Integer.toString(firstNumber) + " + " + Integer.toString(secondNumber);
        }
    }


    private boolean hasMinusSign() {
        return rgen.nextBoolean();
    }

    //instance variables
    private int firstNumber;
    private int secondNumber;
    private String equation;
    private RandomGenerator rgen;
}
