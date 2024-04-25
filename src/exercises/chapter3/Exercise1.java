package exercises.chapter3;

import Media.*;
import static java.lang.Math.*;

/**
 * Modify Example_3_4 (Figure 3.11) to draw 10 concentric pentagons using a
 * method with header:
 * 
 * private void drawPentagon(double radius)
 * 
 * The exterior angle for a pentagon is 2π/5 and the length of a side is 2 r sin
 * π/5.
 * 
 */
public class Exercise1 {

    private Turtle yertle;
    private TurtleDisplayer display;

    public Exercise1(){
        yertle = new Turtle();
        display = new TurtleDisplayer();
        display.placeTurtle(yertle);
        double radius = 10;
        for (int i = 0; i < 10; i++) {
            drawPentagon(radius);
            radius += 10;
        }
        display.close();
    }

    private void drawPentagon(double radius) {
        double side; // exterior angle between sides of hexagon
        double angle; // length of side of the hexagon

        angle = 2 * PI / 5;
        side = 2 * radius * sin(PI / 5);

        yertle.forward(radius);
        yertle.right(PI / 2 + PI / 5);
        yertle.penDown();
        for (int i = 0; i < 5; i++) {
            yertle.forward(side);
            yertle.right(angle);
        }
        yertle.penUp();
        yertle.left(PI / 2 + PI / 5);
        yertle.backward(radius);
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
    }
}
