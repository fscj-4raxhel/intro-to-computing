package lectures.chapter2;

import Media.*;
import static java.lang.Math.PI;
import static java.awt.Color.*;

/** This class is a program to draw two squares on the same displayer using
 * different turtles.
 * 
 * @author D. Hughes, Chris Jin
 * 
 * @version 1.1 (Apr 2024)
 * 
 */

public class TwoOnOne {
    
    private TurtleDisplayer display; // a display to draw on
    private Turtle yertle;           // one turtle to do drawing
    private Turtle mertle;           // another turtle to do drawing

    /** The constructor uses two turtles to draw two squares */

    public TwoOnOne(){
        //Initialization with the assignment statements:
        //variable identifier = creation expression;
        display = new TurtleDisplayer();
        yertle = new Turtle();
        mertle = new Turtle();

        //Place the two turtles in the display
        display.placeTurtle(yertle);
        display.placeTurtle(mertle);

        //Behavior that changes states
        yertle.setPenColor(red);
        mertle.setPenColor(green);
        yertle.moveTo(0,60);//(0,0) is the center, up and right is the positive direction
        yertle.penDown();
        mertle.penDown();

        for (int i = 0; i < 4; i++) {
            yertle.forward(40);
            mertle.forward(40);
            yertle.right(PI / 2);
            mertle.right(PI / 2);
        };
        yertle.penUp();
        mertle.penUp();

        display.close();

    }//constructor

    public static void main(String[] args){TwoOnOne t = new TwoOnOne();};

}
