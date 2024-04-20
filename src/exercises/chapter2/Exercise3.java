package exercises.chapter2;

import Media.*;
import static java.lang.Math.*;

/**
 * @author D. Hughes
 * @version 1.0 (April 2014)
 * “Write a program to draw a cube, in perspective, as shown below.
 * The sides of the cube should be 40 units long.
 * Use any reasonable means to draw the figure
 * (it cannot simply be drawn using a single loop, but must composed of a number of parts.)
 * The turtle can be moved from one place to another without drawing a line
 * if the method penUp is used before the forward.
 * (Don’t forget to put the pen down again.)”

Excerpt From
Introduction to Computer Science
David Hughes
This material may be protected by copyright.
 */
public class Exercise3 {
    private TurtleDisplayer display; //display to draw on
    private Turtle          yertle;  //turtle to do drawing

    public Exercise3(){
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);

        yertle.penDown();

        for (int i = 0; i < 4; i++) {
            yertle.left(PI / 4 + i * PI / 2);
            yertle.forward(40);
            yertle.penUp();
            yertle.backward(40);
            yertle.penDown();
            yertle.right(PI / 4 + i * PI / 2);
            yertle.forward(40);
            yertle.right(PI / 2);
        }

        yertle.penUp();
        yertle.left(PI / 4);
        yertle.forward(40);
        yertle.right(PI / 4);
        yertle.penDown();

        for (int i = 0; i < 4; i++) {
            yertle.forward(40);
            yertle.right(PI / 2);
        }

        display.close();

    }// constructor

    public static void main(String[] args){Exercise3 e3 = new Exercise3();};
}