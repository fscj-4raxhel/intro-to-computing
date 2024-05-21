package lectures.chapter7;

import Media.*;
import static java.lang.Math.*;

public class Normalizer {
    private static final int CLIP_MAX = 32767;
    private SoundPlayer player;

    public Normalizer() {
        Sound theSound;
        player = new SoundPlayer();
        theSound = new Sound();
        player.placeSound(theSound);
        player.waitForUser();
        normalize(theSound);
        player.close();
        theSound.save();
    }

    private void normalize(Sound aSound) {
        int maxAmp = -1, amp;
        double factor;

        for (Sample s : aSound) {
            amp = abs(s.getAmp());
            if (amp > maxAmp) {
                maxAmp = amp;
            }
        }
        factor = (double) CLIP_MAX / maxAmp;
        makeLouder(aSound, factor);
    }

    private void makeLouder(Sound aSound, double by) {
        for (Sample s : aSound) {
            System.out.println("Before: " + s.getAmp());
            s.setAmp((int) (s.getAmp() * by));
            System.out.println("After: " + s.getAmp());
        }
    }

    public static void main(String[] args) {
        Normalizer n = new Normalizer();
    }
}
