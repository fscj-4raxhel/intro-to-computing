package lectures.chapter3;

import Media.*;
import static java.lang.Math.PI;

/**
 * @author D. Hughes, Chris Jin
 * @version 1.1 (April 2024)
 * 
 *          This class demonstrates the first exmaple of method as procedural
 *          abstraction.
 * 
 */
public class TwoSquare {

    private Turtle yertle; // display to draw on
    private TurtleDisplayer display; // turtle to do drawing

    public TwoSquare() {
        yertle = new Turtle();
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        yertle.moveTo(-95, 95);
        drawSquare();
        yertle.moveTo(55, -55);
        drawSquare();
        display.close();

    }// constructor

    private void drawSquare() {

        yertle.penDown();
        for (int i = 0; i < 4; i++) {
            yertle.forward(40);
            yertle.right(PI / 2);
        }
        yertle.penUp();
    }

    public static void main(String[] args){TwoSquare t = new TwoSquare();}

}// class TwoSquare
