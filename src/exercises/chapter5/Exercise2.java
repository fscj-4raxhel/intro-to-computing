package exercises.chapter5;

import Media.*;
import java.awt.*;

/**
 * 
 * Write a program to convert an image into a night-time image.
 * The night-time effect is created by modifying each pixel’s color based on
 * how different (far) it is from "sky-blue" (Color(58,117,197)). For each
 * pixel, the color distance between the pixel’s color and "sky blue" is
 * computed. Each color channel of the pixel is modified by the ratio of this
 * distance value and 311 (the maximum distance) such that “sky-blue” becomes
 * black (the ratio is 0) and the color most distance from “sky-blue” remains
 * unchanged (ratio is 1).
 * 
 */

public class Exercise2 {

    private PictureDisplayer display;
    private Color skyBlue;

    public Exercise2() {
        skyBlue = new Color(58, 117, 197);
        display = new PictureDisplayer();
        Picture pic = new Picture();
        display.placePicture(pic);
        makeNightTime(pic);
        display.close();
        pic.save();

    }

    private void makeNightTime(Picture aPic) {
        Pixel p;
        double d, ratio;

        while (aPic.hasNext()) {
            p = aPic.next();
            d = p.getDistance(skyBlue);
            ratio = (double) d / 311;
            p.setColor((int) (ratio * p.getRed()), (int) (ratio * p.getGreen()), (int) (ratio * p.getBlue()));
        }
    }

    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();
    }
}