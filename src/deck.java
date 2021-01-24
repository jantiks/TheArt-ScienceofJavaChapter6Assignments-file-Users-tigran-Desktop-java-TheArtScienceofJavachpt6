/*
returnes random card from 52 cards deck
 */

import acm.util.*;

public class deck {
    // the constructor
    public deck() {
        rgen = new RandomGenerator();
    }

    // returns a random card
    public String getCard() {
        int cardNumber = rgen.nextInt(1,13);
        switch (cardNumber) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return Integer.toString(cardNumber);
        }
    }
    // returns a random suit for card
    public String getSuit() {
        int suitNumber = rgen.nextInt(1,4);
        switch (suitNumber) {
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return "no suit";
        }
    }

    // instance variables
    private RandomGenerator rgen;
}
