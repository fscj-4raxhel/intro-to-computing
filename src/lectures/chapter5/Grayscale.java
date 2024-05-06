package lectures.chapter5;

import Media.*; // The Media libray contains the classes we need to display a picture

/**
 * 
 * This class is a program to load and display a picture
 * 
 * @author D. Hughes
 * @version 1.0 (June 2013)
 */

public class Grayscale {

    private PictureDisplayer display;

    public Grayscale() {

        Picture pic;

        display = new PictureDisplayer();
        pic = new Picture();
        display.placePicture(pic);
        display.waitForUser();
        makeGray(pic);
        display.close();
        pic.save();

    }// constructor

    private void makeGray(Picture aPic) {

        Pixel P;
        int r;
        int g;
        int b;
        int v;

        while (aPic.hasNext()) {
            P = aPic.next();
            r = P.getRed();
            g = P.getGreen();
            b = P.getBlue();
            v = (r + g + b) / 3;
            P.setRed(v);
            P.setGreen(v);
            P.setBlue(v);
        }
    }

    public static void main(String[] args) {
        Grayscale g = new Grayscale();
    }
}
