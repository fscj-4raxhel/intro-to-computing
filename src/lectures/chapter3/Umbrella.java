package lectures.chapter3;

import Media.*;
import static java.lang.Math.*;
import static java.awt.Color.*;

/**
 * @author D. Hughes, Chris Jin
 * @version 1.1 (April 2024)
 * 
 *          This class uses the parameterized drawHexagon method to draw a beach
 *          umbrella.
 * 
 */
public class Umbrella {

    private Turtle yertle; // display to draw on
    private TurtleDisplayer display; // turtle to do drawing

    public Umbrella() {
        yertle = new Turtle();
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        yertle.setPenWidth(10);
        yertle.setPenColor(RED);

        double radius = 10;
        for (int i = 0; i < 8; i++) {
            drawHexagon(radius);
            radius += 20;
        }
        
        display.close();

    }// constructor

    private void drawHexagon(double radius) {
        double side; // exterior angle between sides of hexagon
        double angle; // length of side of the hexagon

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
        Umbrella h2 = new Umbrella();
    }

}// class Umbrella
