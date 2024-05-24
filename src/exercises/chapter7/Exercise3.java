package exercises.chapter7;

import Media.*;
import static java.lang.Math.*;

/**
 * Write a method:
 * 
 * private Sound makeSine(int nSamples, int freq, int maxAmp)
 * 
 * that create a new sound with default sample rate that has length specified by
 * nSamples,
 * with frequency freq and maximum amplitude maxAmp.
 */
public class Exercise3 {

    private SoundPlayer player;

    public Exercise3() {
        Sound sine = makeSine(22000, 440, 15000);
        player = new SoundPlayer();
        player.placeSound(sine);
        player.close();
        sine.save();
    }

    private Sound makeSine(int nSamples, int freq, int maxAmp) {
        Sound result = new Sound(nSamples);
        double increment = PI * 2 * freq / result.getSampleRate();
        double coordinate = 0;
        for (Sample s : result) {
            s.setAmp((int) (sin(coordinate) * maxAmp));
            coordinate += increment;
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise3 e3 = new Exercise3();
    }
}
