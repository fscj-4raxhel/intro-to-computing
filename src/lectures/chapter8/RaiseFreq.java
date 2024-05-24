package lectures.chapter8;

import Media.*;

public class RaiseFreq {
    private SoundPlayer player;

    public RaiseFreq() {
        Sound oSound, nSound;
        player = new SoundPlayer();
        oSound = new Sound();
        player.placeSound(oSound);
        player.waitForUser();
        nSound = raiseFreq(oSound);
        player.placeSound(nSound);
        player.close();
        nSound.save();
    }

    private Sound raiseFreq(Sound aSound) {
        Sound result = new Sound(aSound.getNumSamples() / 2, aSound);
        for (int i = 0; i < result.getNumSamples(); i++) {
            result.getSample(i).setAmp(aSound.getSample(2 * i).getAmp());
        }
        return result;
    }

    public static void main(String[] args) {
        RaiseFreq rf = new RaiseFreq();
    }
}
