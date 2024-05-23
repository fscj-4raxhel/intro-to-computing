package exercises.chapter7;

import Media.*;

/**
 * Write a program to make a sound quieter. The program should include a method:
 * 
 * private void makeQuieter(Sound aSound, double by)
 * 
 */
public class Exercise1 {
    private SoundPlayer player;

    public Exercise1() {
        Sound theSound;
        player = new SoundPlayer();
        theSound = new Sound();
        player.placeSound(theSound);
        player.waitForUser();
        makeQuieter(theSound, 0.5);
        player.close();
        theSound.save();
    }

    private void makeQuieter(Sound aSound, double by) {
        for (Sample s : aSound) {
            System.out.println("Before: " + s.getAmp());
            s.setAmp((int) (s.getAmp() * by));
            System.out.println("After: " + s.getAmp());
        }
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
    }
}