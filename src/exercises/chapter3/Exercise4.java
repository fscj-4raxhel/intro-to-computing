package exercises.chapter3;

import Media.*;
import static java.lang.Math.*;

/**
 * “As we have seen, the basic geometry and drawing process for regular closed
 * figures (e.g. pentagon, hexagon etc., also known as regular polygons) is
 * essentially the same. This indicates that a general method could be written
 * to draw any polygon. Write a method with header:
 * 
 * private void drawPolygon(int nSides, double radius)
 * 
 * which draws a regular polygon with specified number of  sides and
 * radius, centered on the turtle. The geometry of a regular polygon with n
 * sides is:
 * 
 * Using this method, write a program to draw a triangle centered in the
 * upper left quadrant of the page, a square centered in the upper right
 * quadrant, a pentagon centered in the lower right quadrant and a hexagon
 * centered in the lower left quadrant. Each of the figures should have a radius
 * of 40 units.”
 * 
 * 
 */
public class Exercise4 {

    private Turtle yertle;
    private TurtleDisplayer display;

    public Exercise4() {
        yertle = new Turtle();
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        yertle.moveTo(-60,-60);
        yertle.left(PI / 2);
        drawPolygon(5,15);
        yertle.right(PI / 4);
        drawPolygon(4,60);
        yertle.moveTo(-60,12);
        yertle.left(PI / 4);
        drawPolygon(3,60);
        yertle.moveTo(50,70);
        drawSun(10,10);
        display.close();
    }

    private void drawSun(double radius, int nRays){
        drawPolygon(20,radius);
        for (int i = 0; i < nRays; i++) {
            yertle.forward(radius);
            yertle.penDown();
            yertle.forward(radius);
            yertle.penUp();
            yertle.backward(2 * radius);
            yertle.right(2 * PI / nRays);
        }
        System.out.println("Turtle position X: " + yertle.getScreenX() + "Y: " + yertle.getScreenY());
    }

    private void drawPolygon(int nSides, double radius) {
        double side; // exterior angle between sides of hexagon
        double angle; // length of side of the hexagon

        angle = 2 * PI / nSides;
        side = 2 * radius * sin(PI / nSides);

        yertle.forward(radius);
        yertle.right(PI / 2 + PI / nSides);
        yertle.penDown();
        for (int i = 0; i < nSides; i++) {
            yertle.forward(side);
            // System.out.println("Turtle position X: " + yertle.getScreenX() + "Y: " + yertle.getScreenY());
            yertle.right(angle);
        }
        yertle.penUp();
        yertle.left(PI / 2 + PI / nSides);
        yertle.backward(radius);
    }

    public static void main(String[] args) {
        Exercise4 e4 = new Exercise4();
    }
}
