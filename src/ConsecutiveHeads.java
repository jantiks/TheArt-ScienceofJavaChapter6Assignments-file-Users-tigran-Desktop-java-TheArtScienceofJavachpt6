/*
this class continues executing until three consecutive heads are tossed
 */
import acm.program.*;

public class ConsecutiveHeads extends ConsoleProgram {
    //runs the program
    public void run() {
        int headCount = 0;
        int flips = 0;
        while (headCount < 3) {
            String side = coin.flipCoin();
            if (side.equals("Head")) {
                println("Head");
                headCount += 1;
            } else {
                println("Tails");
                headCount = 0;
            }
            flips += 1;
        }
        println("It took " + flips + " flips to get " + headCount + " consecutive heads.");
    }

    //instance variables
    private coin coin = new coin();
}
