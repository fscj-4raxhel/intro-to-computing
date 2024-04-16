package lectures.chapter2;

import Media.*;
import static java.lang.Math.*;


/**
 * @author D. Hughes, Chris Jin
 * @version 1.1 (April 2024)
 * 
 * This class demonstrates for loop structure in Java.
 * With the help of a for loop, the turtle repeats drawing a line segment
 * of certain length and make a turn.
 * 
 */
public class Hexagon {
    private TurtleDisplayer display; //display to draw on
    private Turtle          yertle;  //turtle to do drawing

    public Hexagon(){
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);

        yertle.penDown();
        yertle.right(PI/2);

        for (int i = 0; i < 6; i++) {
            yertle.forward(40);
            yertle.right( PI / 3);
        }

        display.close();

    }// constructor

    public static void main(String[] args){Hexagon h = new Hexagon();};
}
