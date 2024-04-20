package exercises.chapter2;

import Media.*;
import static java.lang.Math.*;

/**
 * @author D. Hughes
 * @version 1.0 (April 2014)
 *          "Write a program to draw a picture frame:
 *          The frame is essentially a square 90 units on a side, except that
 *          each side is replaced by a sequence of 6 connected pieces consisting
 *          of 7 lines drawn as shown:
 *          To make the frame bold, use the Turtle method penWidth(2) before
 *          drawing the lines. This sets the width of the drawing pen to 2
 *          units."
 * 
 *          Excerpt From
 *          Introduction to Computer Science
 *          David Hughes
 *          This material may be protected by copyright.
 * 
 */
public class Exercise6 {
    private TurtleDisplayer display; // display to draw on
    private Turtle yertle; // turtle to do drawing

    public Exercise6() {
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);

        yertle.setPenWidth(2);
        yertle.penDown();

        for (int i = 0; i < 4; i++) {
            // Draw a picket
            for (int j = 0; j < 6; j++) {
                yertle.forward(5);
                yertle.left(PI / 2);
                yertle.forward(5);
                yertle.left(PI / 2);
                yertle.forward(5);
                yertle.right(PI / 2);
                yertle.forward(5);
                yertle.right(PI / 2);
                yertle.forward(10);
                yertle.right(PI / 2);
                yertle.forward(10);
                yertle.left(PI / 2);
                yertle.forward(5);
            }
            yertle.right(PI / 2);
        }

        yertle.penUp();
        yertle.setPenWidth(1);
        display.close();

    }// constructor

    public static void main(String[] args) {
        Exercise6 e6 = new Exercise6();
    };
}
