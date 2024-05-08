package exercises.chapter5;

import Media.*;
import java.awt.*;

/**
 * 
 * Write a program to produce a color negative (such as could be used in a
 * printing process) of a picture. A color negative is a picture in which the
 * color channels for each pixel have had their value inverted. That is, if the
 * red channel value is r, it is replaced by 255-r. The same is true for the
 * green and blue channels.
 * 
 * Write a method:
 * 
 * private void makeNegative(Picture aPic){ ... }
 * 
 * that changes all the pixels in aPic to their inverse, producing a color
 * negative. The program should allow the user to select a picture, present it
 * on the display, modify it to a color negative and save the result.
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