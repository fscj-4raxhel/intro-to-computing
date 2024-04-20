package exercises.chapter2;
import Media.*;
import static java.lang.Math.*;

/**
 * @author D. Hughes
 * @version 1.0 (April 2014)
 * 
 * Modify Example_2_2 (Hexagon) to draw a pentagon (a regular five-sided closed figure)
 * with sides 40 units long. The exterior angle of a pentagon is 2π/5.”
 */
public class Exercises1 {
    private TurtleDisplayer display; //display to draw on
    private Turtle          yertle;  //turtle to do drawing

    public Exercises1(){
        display = new TurtleDisplayer();
        yertle = new Turtle();
        display.placeTurtle(yertle);

        yertle.penDown();

        for (int i = 0; i < 5; i++) {
            yertle.forward(40);
            yertle.right( 2 * PI / 5);
        }

        display.close();

    }// constructor

    public static void main(String[] args){Exercises1 e = new Exercises1();};
}