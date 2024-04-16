package lectures.chapter2;

import Media.*;
import static java.lang.Math.*;

/**
 * @author D. Hughes, Chris Jin
 * @version 1.1 (April 2024)
 * 
 * This class is the very first program in the course COSC 1P02
 * 
 */
public class Square {

    private TurtleDisplayer display; //display to draw on
    private Turtle          yertle;  //turtle to do drawing

    public Square(){
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);

        yertle.penDown();
        yertle.right(PI/2);
        yertle.forward(40);
        yertle.right(PI/2);
        yertle.forward(40);
        yertle.right(PI/2);
        yertle.forward(40);
        yertle.right(PI/2);
        yertle.forward(40);
        yertle.penUp();

        display.close();

    }// constructor

    public static void main(String[] args){Square s = new Square();};
}
