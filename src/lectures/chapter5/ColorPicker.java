package lectures.chapter5;

import Media.*;
import java.awt.*;

public class ColorPicker {
    private static final int R = 64;
    private static final int G = 128;
    private static final int B = 192;
    private PictureDisplayer display;

    /** constructer */
    public ColorPicker() {
        Picture pic;

        Color c = new Color(R, G, B);
        pic = makeSwatch(200, 200, c);
        display = new PictureDisplayer();
        display.placePicture(pic);
        display.close();
        pic.save();

    }

    private Picture makeSwatch(int width, int height, Color color) {
        Picture result;
        Pixel p;

        result = new Picture(width, height);
        while (result.hasNext()) {
            p = result.next();
            p.setColor(color);

        }
        return result;

    }

    public static void main(String[] args) {
        ColorPicker cp = new ColorPicker();
    }
}
