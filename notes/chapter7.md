# Sound

## The Natrual Properties of Sound and Human Ears
Sounds occur as wave of air pressure. The height of a sound wave is called amplitude and the distance, which is time, between two consequtive crests is called cycle length. The frequence of the sound is the number of cycles per second.

The volume of a sound is related to aimplitude. The larger the amplitude the higher the volume and the louder the sound. Our ears is detecting change in amplitude, which is measure as a ratio as decibles (dB). A 3 dB change represents a doubling of the volume. With the softest sould we can hear is normalized as 0 dB, a normal speech is around 60 dBs while shouting is aroud 80 dBs.

Natural sounds are not composed of a single frequency but contain overtones of other frequencies at lower amplitude. The central (greatest amplitude) tone is called the fundamental tone.

## Digitalization of Sound
When a sound is recorded, the microphone measures the air pressure and produces an electric current. As the amplitude of the sound increases, the voltage increases resulting in an electric signal varying in voltage that mimics the sound wave. An Analog to Digital Converter (ADC) converts the analog electric signal produced by the microphone into a sequence of digital values by sampling the voltage at fixed intervals (sampling rate) and recording the voltage value as an integer sample.

Nyquist’s Theorem states that to capture a frequency up to n Hz, it is necessary to capture 2n samples per second. Since the human ear detects up to about 22,000 Hz, we need a sampling rate of about 44,000 samples per second to capture any frequency that we can hear. Audio CDs are digitized at 44,100 samples per second.

Each sample is an integral value. The range of values depends on the sample size—the number of bytes used to record each sample. With a sample size of 2 bytes, we can capture the range from ‑32,768 to 32,767. This is the sample size used on audio CDs. To record 80 minutes of music sampled at 44,100 samples per second with 2 bytes per sample and two tracks (stereo) we require 846,720,000 bytes or essentially 800Mb.

In short, sounds are represented as a collection of samples, which are integer values representing the voltage of the voltages recorded by the ADC.

## Normalization of Sound
Since the amplitudes are represented as integer values, they have ranges of values. When we scale up the amplitude of samples in a sound to make it louder, there is a risk that the new amplitude value get out of the range of its sample size can represent. The sound is distorted. This is called clipping. To make the sound as loud as possible without clipping we need to normalize the sound with two passes.

In the first pass, we figure out the maximum amplitude which in turn determines the factor by which we scale the amplitudes. And in the second pass we modify the amplitudes.

We need two pass partially because of the iterator we use can't go backwards or reset to the beginning. So for two passes, we need two iterators.