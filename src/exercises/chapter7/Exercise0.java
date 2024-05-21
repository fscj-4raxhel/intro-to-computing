package exercises.chapter7;

import Media.*;

/**
 * 
 * This class is a test of the difference between while loop and for-each loop
 * in terms of the iterator API.
 */
class Exercise0 {
    private SoundPlayer player;

    public Exercise0() {
        Sound theSound;
        player = new SoundPlayer();
        theSound = new Sound();
        player.placeSound(theSound);
        player.waitForUser();
        // whileIterate(theSound);
        foreachIterate(theSound);

    }

    private void whileIterate(Sound aSound) {
        while (aSound.hasNext()) {
            aSound.next();
        }
        int count = 0;
        while (aSound.hasNext()) {
            aSound.next();
            count++;
        }
        System.out.println("The second while loop is executed " + count + " times");
    }

    private void foreachIterate(Sound aSound) {
        for (Sample aSample : aSound) {
            System.out.println("Print from the first for each loop");
        }
        int count = 0;
        for (Sample aSample : aSound) {
            System.out.println("Print from the Second for each loop");
            count++;
        }
        System.out.println("The second while loop is executed " + count + " times");

    }

    public static void main(String[] args) {
        Exercise0 e0 = new Exercise0();
    }
}