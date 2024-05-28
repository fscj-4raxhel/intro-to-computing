package exercises.chapter8;

import Media.*;

public class Exercise1 {

    private SoundPlayer player;

    /**
     * Clipping a sound is just to copy a part of the samples from one position to
     * another
     * If we know the indices of the starting sample and the terminating sample the
     * task is very easy.
     */

    public Exercise1() {
        player = new SoundPlayer();
        Sound oriSound, clippedSound;
        oriSound = new Sound();
        player.placeSound(oriSound);
        clippedSound = clip(oriSound, 100, 1200);
        player.close();
        clippedSound.save();
    }

    /**
     * This method clips parts of the original Sound
     * 
     * @param original The original sound to clip from
     * @param from     the starting index of the clip
     * @param to       the terminating index of the clip (inclusive)
     * @return The Sound object that contains the specified Sound clip
     */
    private Sound clip(Sound original, int from, int to) {
        Sound result = new Sound(to - from + 1);
        for (int i = from; i <= to; i++) {
            result.getSample(i - from).setAmp(original.getSample(i).getAmp());
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
    }
}
