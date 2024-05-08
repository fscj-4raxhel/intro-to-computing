package lectures.chapter5;

import Media.*;
import static java.awt.Color.*;

/**
 * This class is a program to do redeye correction on a picture.
 * 
 * @author D. Hughes
 * @version 1.0 (Juun 2013)
 */
public class RedEye {

    private static final double TOLERANCE = 155.0; // tolerance distance from red
    private PictureDisplayer display; // displayer for picture

    /**
     * The constructor loads picture, does redeye correction and displays picture
     */
    public RedEye() {

        Picture pic;

        display = new PictureDisplayer();
        pic = new Picture();
        display.placePicture(pic);
        display.waitForUser();
        correct(pic);
        display.close();
        pic.save();
    }; // constructor

    /**
     * This method does redeye correction on a picture
     * 
     * @param aPic picture to be corrected.
     * 
     */
    private void correct(Picture aPic) {
        Pixel p;

        while (aPic.hasNext()) {
            p = aPic.next();
            if (p.getDistance(RED) < TOLERANCE) {
                p.setColor(BLACK);
            }
        }
    }// correct

    public static void main(String[] args) {
        RedEye r = new RedEye();
    }
}
