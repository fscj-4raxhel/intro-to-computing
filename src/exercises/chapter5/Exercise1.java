package exercises.chapter5;

import Media.*;

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
public class Exercise1 {

    private PictureDisplayer display;

    public Exercise1() {
        display = new PictureDisplayer();
        Picture pic = new Picture();
        display.placePicture(pic);
        makeNegative(pic);
        display.close();
        pic.save();

    }

    private void makeNegative(Picture aPic) {
        Pixel p;
        while (aPic.hasNext()) {
            p = aPic.next();
            p.setColor(255 - p.getRed(), 255 - p.getGreen(), 255 - p.getBlue());
        }
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
    }
}
