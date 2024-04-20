package exercises.chapter2;

import Media.*;
import static java.lang.Math.*;

/**
 * @author D. Hughes
 * @version 1.0 (April 2014)
 *          “Write a program to draw a picket fence (shown below) as series of
 *          13 pickets (boards), each a rectangle 10 units wide and 80 units
 *          high. The pickets should be spaced 5 units apart.”
 * 
 *          Excerpt From
 *          Introduction to Computer Science
 *          David Hughes
 *          This material may be protected by copyright.
 * 
 */
public class Exercise5 {
    private TurtleDisplayer display; // display to draw on
    private Turtle yertle; // turtle to do drawing

    public Exercise5() {
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);

        yertle.backward(90);
        yertle.penDown();

        for (int i = 0; i < 13; i++) {
            //Draw a picket
            for(int j = 0; j < 2; j++){
                yertle.forward(10);
                yertle.right(PI /2);
                yertle.forward(80);
                yertle.right(PI /2);
            }
            yertle.penUp();
            yertle.forward(15);
            yertle.penDown();
        }

        yertle.penUp();
        display.close();

    }// constructor

    public static void main(String[] args) {
        Exercise5 e5 = new Exercise5();
    };
}
