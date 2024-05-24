package lectures.chapter8;

import Media.*;
import java.awt.*;
import static java.lang.Math.*;

public class RandomPaint {

    private PictureDisplayer display;

    public RandomPaint() {

        display = new PictureDisplayer();
        Picture aPic = new Picture(200, 200);

        display.placePicture(aPic);
        paint(aPic, 10000);
        display.close();
        aPic.save();
    }

    private void paint(Picture aPic, int num) {
        int x, y, height = aPic.getHeight(), width = aPic.getWidth();
        for (int i = 0; i < num; i++) {
            x = (int) (random() * width);
            y = (int) (random() * height);
            aPic.getPixel(x, y).setColor(new Color((int) (random() * 16777216)));
        }
    }

    public static void main(String[] args) {
        RandomPaint rp = new RandomPaint();
    }
}
