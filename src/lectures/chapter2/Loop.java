package lectures.chapter2;

import Media.*;
import static java.lang.Math.*;


/**
 * @author D. Hughes, Chris Jin
 * @version 1.1 (April 2024)
 * 
 * This class demonstrates for loop structure in Java.
 * With the help of a for loop, the turtle repeats drawing a line segment
 * of certain length and make a turn.
 * 
 */
public class Loop {
    private TurtleDisplayer display; //display to draw on
    private Turtle          yertle;  //turtle to do drawing

    public Loop(int length, int n){
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);

        yertle.penDown();
        yertle.right(PI/2);

        for (int i = 0; i < n; i++) {
            yertle.forward(length);
            yertle.right( 2 * PI / n);
        }

        display.close();

    }// constructor

    public static void main(String[] args){Loop l = new Loop(40, 8);};
}
