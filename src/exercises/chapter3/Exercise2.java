package exercises.chapter3;

import Media.*;
import static java.lang.Math.*;

/**
 * “Write a method with header:
 * 
 * private void drawPentagram(double radius)
 * 
 * which draws a pentagram of specified radius centered on the turtle. The
 * geometry of a pentagram is:
 * 
 * Write a program that uses the method to draw a pentagram of radius 60
 * centered on the page.
 * 
 */
public class Exercise2 {

    private Turtle yertle;
    private TurtleDisplayer display;

    public Exercise2() {
        yertle = new Turtle();
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        drawPentagram(60);
        display.close();
    }

    private void drawPentagram(double radius) {
        double side; // exterior angle between sides of hexagon
        double angle; // length of side of the hexagon

        angle = 4 * PI / 5;
        side = 2 * radius * cos(PI / 10);

        yertle.forward(radius);
        yertle.right(9 * PI / 10);
        yertle.penDown();
        for (int i = 0; i < 5; i++) {
            yertle.forward(side);
            yertle.right(angle);
        }
        yertle.penUp();
        yertle.left(9 * PI / 10);
        yertle.backward(radius);
    }

    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();
    }
}
