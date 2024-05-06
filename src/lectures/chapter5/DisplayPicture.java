package lectures.chapter5;

import Media.*; // The Media libray contains the classes we need to display a picture

/**
 * 
 * This class is a program to load and display a picture
 * 
 * @author D. Hughes
 * @version 1.0 (June 2013)
 */

public class DisplayPicture {

    private PictureDisplayer display;

    public DisplayPicture() {

        Picture pic;
        display = new PictureDisplayer();
        pic = new Picture();
        display.placePicture(pic);
        display.close();

    }// constructor

    public static void main(String[] args) {
        DisplayPicture d = new DisplayPicture();
    }
}
