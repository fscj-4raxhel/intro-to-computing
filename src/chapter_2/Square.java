package chapter_2;

import Media.*;
import static java.lang.Math.*;


/** This class is a program to draw a square using Turtle Graphics.
  * 
  * @author D. Hughes
  * 
  * @version 1.0 (Apr 2012)
  * 
  * new concepts: package, library, class, object, declartion, variable,
  *     statement, method call, constructor, object creation, turtle displayer,
  *     turtle graphics                                                          */

public class Square {
    
    
    private TurtleDisplayer  display;  // display to draw on
    private Turtle           yertle;   // turtle to do drawing
    
    
    /** The constructor draws a square using Turtle Graphics.                    */
    
    public Square ( ) {
        
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);
        
        yertle.penDown();
        yertle.forward(40);
        yertle.right(PI/2);
        yertle.forward(40);
        yertle.right(PI/2);
        yertle.forward(40);
        yertle.right(PI/2);
        yertle.forward(40);
        yertle.right(PI/2);
        yertle.penUp();
        
        display.close();
        
    };  // constructor
    
    
    public static void main ( String[] args ) { Square s = new Square(); };
    
    
}