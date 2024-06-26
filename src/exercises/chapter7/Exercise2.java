package exercises.chapter7;

import Media.*;
import static java.lang.Math.*;

/**
 * The bane of recording engineers and audiophiles is noise. What is noise?
 * Noise is an unwanted signal (waveform) that distorts the desired signal (e.g.
 * the music). Noise occurs from many different sources. Background noise is
 * extraneous sounds occurring in the background such as conversations at other
 * tables in a restaurant. Electronic noise or hum that is generated by
 * electronic circuits and high voltage lines. Hiss is noise that is produced by
 * random effects such as cosmic rays, random fluctuations in current etc.
 * 
 * Write a program to generate hiss. Hiss is just a random signal. We can
 * generate it by choosing random values for the amplitudes of the samples in
 * the sound. The waveform produced will be highly irregular and we will hear
 * the result as hiss.
 * 
 * To generate the random amplitude values for the samples, we can use the
 * random method from the java.lang.Math library. random generates a random
 * value between 0.0 and 1.0. We need amplitudes between –maxAmp and maxAmp if
 * the amplitude of the hiss is to be maxAmp.
 * 
 * Write the code that generates hiss as a method:
 * 
 * private Sound makeHiss(int nSamples, int maxAmp)
 * 
 * where nSamples is the number of samples for the sound and  maxAmp is the
 * maximum amplitude of the noise[…]
 * 
 */
public class Exercise2 {

    private SoundPlayer player;

    public Exercise2() {
        Sound noise = makeHiss(22000, 10000);
        player = new SoundPlayer();
        player.placeSound(noise);
        player.close();
        noise.save();
    }

    private Sound makeHiss(int nSamples, int maxAmp) {
        Sound result = new Sound(nSamples);
        for (Sample s : result) {
            s.setAmp((int) (random() * maxAmp) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();
    }
}
