package exercises.chapter3;

import Media.*;
import static java.lang.Math.*;

/**
 * An epitrochoid is a figure that results from one circle rotating about
 * another circle with a pen attached to the outer circle. These figures are the
 * kinds of figures drawn by the children's toy Spirograph™ where one toothed
 * disk (the outer circle) has a hole for a pen and rotates around the other
 * toothed disk (the inner circle). The figures are dependent on the radius of
 * the inner circle (a), the radius of the outer circle (b) and the distance of
 * the pen from the center of the outer circle (k). In Spirograph™ k is always
 * smaller than b due to physical limitations, but in general it doesn’t have to
 * be so. Write a method with header:
 * 
 * private void drawEpitrochoid(double a, double b, double k, int num)
 * 
 * which draws an epitrochoid. The method will use the turtle absolute drawing
 * method moveTo instead of the relative drawing method forward. The points
 * (x,y) for the drawing are based on a variable t as follows:
 * 
 * x = (a+b)cos(2πt) - kcos(2π(a+b)t/b)
 * y = (a+b)sin(2πt) - ksin(2π(a+b)t/b)
 * 
 * 
 * The turtle must be moved to the first point (i.e. t=0) with the pen up and
 * then num (the last parameter) lines can be drawn (with the pen down) with t
 * incremented by 1/num each time (i.e. t runs in the interval 0..1).
 * For example, the method call: drawEpitrochoid(50,5,10,100) would draw
 * the following figure:
 * 
 * Write a program which uses the drawEpitrochoid method to draw the figure
 * above. Modify the program to make the call: drawEpitrochoid(20,10,40,100).
 * Try some other values of your own choice.
 * 
 * 
 */
public class Exercise6 {

    private Turtle yertle;
    private TurtleDisplayer display;

    public Exercise6() {
        yertle = new Turtle();
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        drawEpitrochoid(50,5,10,100);
        display.close();
    }

    private void drawEpitrochoid(double a, double b, double k, int num) {

        double x,y,t=0,tem=0,inc = 1.0 / num;
        x = (a+b) * cos(0) - k * cos(0);
        y = (a+b) * sin(0) - k * sin(0);
        yertle.moveTo(x, y);
        yertle.penDown();

        for (int i = 0; i < num; i++) {
            t += inc;
            tem = 2 * PI * t;
            x = (a+b) * cos(tem) - k * cos(tem * (a + b) / b);
            y = (a+b) * sin(tem) - k * sin(tem * (a + b) / b);
            yertle.moveTo(x,y);
        }

        yertle.penUp();
        yertle.moveTo(x, y);
    }

    public static void main(String[] args) {
        Exercise6 e6 = new Exercise6();
    }
}
