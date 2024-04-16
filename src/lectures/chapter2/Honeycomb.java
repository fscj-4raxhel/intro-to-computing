package lectures.chapter2;

import Media.*;
import static java.lang.Math.PI;

/**
 * @author D. Hughes, Chris Jin
 * @version 1.1 (April 2024)
 * 
 * This class uses turtle graphics to draw a Honeycomb on the canvas.
 * The concept is nested loop.
 * 
 */
public class Honeycomb{

    private TurtleDisplayer display;
    private Turtle yertle;

    public Honeycomb(){
        
        // Initialize instance variables
        display = new TurtleDisplayer();
        yertle = new Turtle();

        //Place the Turtle yertle
        display.placeTurtle(yertle);

        //Move yertle to the starting position
        yertle.forward(40);
        yertle.left(2 * PI / 3);
        //The ourter loop repeats six times of drawing a hexagon and
        //Move to the starting point of the next hexagon
        yertle.penDown();
        for(int i = 0; i < 6; i++){
            //Draw hexagon
            for(int j = 0; j < 6; j++){
                yertle.forward(40);
                yertle.right(PI/3);
            }
            yertle.penUp();
            yertle.forward(40);
            yertle.left(PI / 3);
            yertle.penDown();
        }
        yertle.penUp();

        display.close();


    }// constructor

    public static void main(String[] args){Honeycomb h = new Honeycomb();}

}
