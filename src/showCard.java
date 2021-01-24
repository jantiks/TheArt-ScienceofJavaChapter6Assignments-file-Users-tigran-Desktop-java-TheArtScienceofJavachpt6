/*
this class randomly shows cards from 52 card deck
 */

import acm.program.*;

public class showCard extends ConsoleProgram {
    // runs the program
    public void run() {
        println("this program displays a randomly choosen card");
        String card = deck.getCard();
        String suit = deck.getSuit();

        println(card + " of " + suit);
    }

    // instance variable
    deck deck = new deck();
}
