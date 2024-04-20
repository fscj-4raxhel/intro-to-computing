package exercises.chapter2;

import Media.*;
import static java.lang.Math.*;

/**
 * @author D. Hughes
 * @version 1.0 (April 2014)
 *          “Modify Example_2_3 (Honeycomb) to draw the following figure (a
 *          poppy) which consists of four equilateral triangles (side 40 units,
 *          exterior angle 2π/3) each rotated π/2 from the other.”
 * 
 *          Excerpt From
 *          Introduction to Computer Science
 *          David Hughes
 *          This material may be protected by copyright.
 * 
 */
public class Exercise4 {
    private TurtleDisplayer display; // display to draw on
    private Turtle yertle; // turtle to do drawing

    public Exercise4() {
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);

        yertle.penDown();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                yertle.forward(40);
                yertle.right(2 * PI / 3);
            }
            yertle.right(PI / 2);
        }

        yertle.penUp();
        display.close();

    }// constructor

    public static void main(String[] args) {
        Exercise4 e4 = new Exercise4();
    };
}
