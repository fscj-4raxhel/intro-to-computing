package exercises.chapter2;

import Media.*;
import static java.lang.Math.*;

/**
 * @author D. Hughes
 * @version 1.0 (April 2014)
 * "Modify Example_2_2 (Hexagon) to draw a pentagram
 * (as shown below, a regular five-point star) with sides 80 units long.
 * The exterior angle (i.e. from one side to the next) is 4π/5.”

Excerpt From
Introduction to Computer Science
David Hughes
This material may be protected by copyright.
 */
public class Exercise2 {
    private TurtleDisplayer display; //display to draw on
    private Turtle          yertle;  //turtle to do drawing

    public Exercise2(){
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);

        yertle.penDown();

        for (int i = 0; i < 5; i++) {
            yertle.forward(80);
            yertle.right( 4 * PI / 5);
        }

        display.close();

    }// constructor

    public static void main(String[] args){Exercise2 e2 = new Exercise2();};
}
