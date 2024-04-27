package exercises.chapter3;

import Media.*;
import static java.lang.Math.*;

/**
 * A polyspiral is a spiral-shaped figure consisting of straight lines, each at
 * a particular angle from the other and each line longer than the last by some
 * amount (increment). Write a method with header:
 * 
 * private void drawPolyspiral(double len double angle, double inc, int num)
 * 
 * which draws a polyspiral, starting at the current turtle position and
 * direction. The spiral consists of num lines with the first line of length
 * len. The angle between sides is angle radians and the increment in line
 * length is inc. For example, the method call: drawPolyspiral(2,PI/3,2,50)
 * would draw the following figure:
 * 
 * Write a program that will draw the figure above using drawPolyspiral. Modify
 * the program to use the call: drawPolyspiral(1,0.9*PI,2,90). Try some other
 * sets of parameters.
 * 
 */
public class Exercise5 {

    private Turtle yertle;
    private TurtleDisplayer display;

    public Exercise5() {
        yertle = new Turtle();
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        drawPolyspiral(2, PI / 3, 2, 50);
        display.close();
    }

    private void drawPolyspiral(double len, double angle, double inc, int num) {

        int x = yertle.getScreenX();
        int y = yertle.getScreenY();
        yertle.penDown();

        for (int i = 0; i < num; i++) {
            yertle.forward(len);
            yertle.right(angle);
            len += inc;
        }

        yertle.penUp();
        yertle.moveTo(x, y);
    }

    public static void main(String[] args) {
        Exercise5 e5 = new Exercise5();
    }
}
