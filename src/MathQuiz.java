/*
this class gives simple math equation for solving
 */

import acm.program.*;
import acm.util.RandomGenerator;

import java.util.Random;

public class MathQuiz extends ConsoleProgram {
    //constants
    private static final int questionQuantity = 5;

    // runs the program
    public void run() {
        println("this is math quiz");
        for (int i = 0; i < questionQuantity; i++) {
            calculator.makeEquation();
            int first = calculator.getFirstNumber();
            int second = calculator.getSecondNumber();
            String equation = calculator.getEquation();

            getSolution(equation, first, second);
        }
    }
    private void getSolution(String equation ,int first , int second) {
        int typedAnswer = readInt("What is " + equation + "?");
        while (tries < 3) {
            if (typedAnswer == (first + second)) {
                println("correct");
                break;
            } else {
                tries += 1;
                typedAnswer = readInt("that is incorrect try different answer");
            }
        }
    }

    //instance variables
    private int tries = 0;
    private CalculatioGenerator calculator = new CalculatioGenerator();
}
