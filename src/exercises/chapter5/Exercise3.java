package exercises.chapter5;

import Media.*;

/**
 * When a poster is printed, it is sometimes printed with a reduced color
 * palate, for example instead of 256 levels for each color component (i.e. 16
 * million colors), only a small number such as 4 (giving only 64 distinct
 * colors) is used. The effect on the image is called "posterizing".
 * 
 * Write a program that inputs a picture, displays it (waiting for the user)
 * and then posterizes it to have only 4 levels per color channel.
 * 
 * What we want to do is reduce each color channel from the range 0-255 (8 bits)
 * to the range 0-3 (2 bits). We can do this by dividing the color channel value
 * by 64. However, since our actual display still uses 1 byte per color channel,
 * all values 0-3 will all look very much like black (very low color intensity).
 * To make it look right, we need to scale the values back up to the original
 * range (multiply by 64). Note that, if integer division is used, this means
 * that only 4 color channel values will occur: 0, 64, 128 and 192, imitating a
 * 2-bit color palate.
 * 
 */
public class Exercise3 {

    private PictureDisplayer display;

    public Exercise3() {
        display = new PictureDisplayer();
        Picture pic = new Picture();
        display.placePicture(pic);
        display.waitForUser();
        posterizing(pic);
        display.close();
        pic.save();

    }

    private void posterizing(Picture aPic) {
        Pixel p;
        int r;
        int g;
        int b;

        while (aPic.hasNext()) {
            p = aPic.next();
            r = p.getRed();
            g = p.getGreen();
            b = p.getBlue();

            r = r / 64 * 64;
            g = g / 64 * 64;
            b = b / 64 * 64;
            p.setColor(r, g, b);
        }
    }

    public static void main(String[] args) {
        Exercise3 e3 = new Exercise3();
    }
}