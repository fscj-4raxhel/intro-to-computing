package exercises.chapter8;

import Media.*;

public class Exercise2 {

    private SoundPlayer player;

    /**
     * Clipping a sound is just to copy a part of the samples from one position to
     * another
     * If we know the indices of the starting sample and the terminating sample the
     * task is very easy.
     */

    public Exercise2() {
        player = new SoundPlayer();
        Sound firstSound, secondSound;
        firstSound = new Sound();
        secondSound = new Sound();
        Sound splicedSound = splice(firstSound, secondSound);
        player.placeSound(splicedSound);
        player.close();
        splicedSound.save();
    }

    /**
     * This method splices two sounds.
     * 
     * @param sound1 The first sound
     * @param sound2 The second sound
     * @return A new sound that contains all samples from sound1 followed by samples
     *         in sound2.
     */
    private Sound splice(Sound sound1, Sound sound2) {
        int numSample1 = sound1.getNumSamples();
        int numSample2 = sound2.getNumSamples();
        Sound result = new Sound(numSample1 + numSample2);
        Sample s;
        for (int i = 0; i < result.getNumSamples(); i++) {
            if (i < sound1.getNumSamples()) {
                s = sound1.getSample(i);
            } else {
                s = sound2.getSample(i - sound1.getNumSamples());
            }
            result.getSample(i).setAmp(s.getAmp());
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();
    }
}
