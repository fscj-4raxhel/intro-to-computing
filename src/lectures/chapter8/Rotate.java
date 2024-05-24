package lectures.chapter8;

import Media.*;
import java.awt.*;

public class Rotate {

    private PictureDisplayer display;

    public Rotate() {

        display = new PictureDisplayer();
        Picture aPic = new Picture();

        display.placePicture(aPic);
        aPic = rotate(aPic);
        display.placePicture(aPic);
        display.close();
        aPic.save();
    }

    private Picture rotate(Picture aPic) {
        Picture result;
        int height = aPic.getHeight(), width = aPic.getWidth();
        result = new Picture(height, width);
        Color color;
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                color = aPic.getPixel(c, r).getColor();
                result.getPixel(r, width - 1 - c).setColor(color);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Rotate r = new Rotate();
    }
}
