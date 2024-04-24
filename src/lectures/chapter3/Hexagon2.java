package lectures.chapter3;

import Media.*;
import static java.lang.Math.*;

/**
 * @author D. Hughes, Chris Jin
 * @version 1.1 (April 2024)
 * 
 *          This class improves reusability of the Hexagon class by
 *          centering the hexagon to be drawn at the current position of the
 *          turtle.
 * 
 */
public class Hexagon2 {

    private Turtle yertle; // display to draw on
    private TurtleDisplayer display; // turtle to do drawing

    public Hexagon2() {
        yertle = new Turtle();
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        drawHexagon();
        display.close();

    }// constructor

    private void drawHexagon() {
        double radius;  // radius of hexagon
        double side;    // exterior angle between sides of hexagon
        double angle;   // length of side of the hexagon

        radius = 80;
        angle = PI / 3;
        side = 2 * radius * sin(PI / 6);
        
        yertle.forward(radius);
        yertle.right(PI / 2 + PI / 6);
        yertle.penDown();
        for (int i = 0; i < 6; i++) {
            yertle.forward(side);
            yertle.right(angle);
        }
        yertle.penUp();
        yertle.left(PI / 2 + PI / 6);
        yertle.backward(radius);
    }// drawHexagon

    public static void main(String[] args) {
        Hexagon2 h2 = new Hexagon2();
    }

}// class Hexagon2
