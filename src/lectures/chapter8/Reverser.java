package lectures.chapter8;

import Media.*;

public class Reverser {
    private SoundPlayer player;

    public Reverser() {
        Sound oSound, nSound;
        player = new SoundPlayer();
        oSound = new Sound();
        player.placeSound(oSound);
        player.waitForUser();
        nSound = reverse(oSound);
        player.placeSound(nSound);
        player.close();
        nSound.save();
    }

    private Sound reverse(Sound aSound) {
        int numAmp = aSound.getNumSamples();
        Sound result = new Sound(numAmp, aSound);

        for (int i = 0; i < result.getNumSamples(); i++) {
            result.getSample(i).setAmp(aSound.getSample(numAmp - 1 - i).getAmp());
        }
        return result;
    }

    public static void main(String[] args) {
        Reverser r = new Reverser();
    }
}