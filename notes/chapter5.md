# Pictures
Computer graphics is the study of creation and manipulation of images, still and moving. The most common representation of picture is as pixels, which are made up of RGB-triples. Manipulation of picture is then the modifiction of the color of pixels. And this process involes a sequencing through a collection. We will use a while loop to iterate the pixels of the picture and use if statement to decide whether or not to perform some actions.

## Representing Pictures
Part of the electromagnetic specturm is light. From 370 -- 730 nanometer is the range of visible light. Human beings can see this part of spectrum.

There are three sensors called cones in human eyes that preceive different wavelength and send electric current with different voltage to the brain which then interpretate it into color. The three cones have different sensitivity to the same wavelength, one send high voltage for blue light, one for green light and one for red light. And even with single wavelength light, all three sensors send currents. So the natural representation of light in computer is to use a RGB triple with three color channels. We use one byte to represent each channel so the value varies from 0 to 255. As a result $256^3 = 16,777,216$ colors can be represented in computre while human eyes can recognize around $10,000,000$ colors.

Then three light sources are close enough together, they appear to the eyes as one color instead of three. Using this priciple a television or computer screen is designed as a matrix of spots, called pixels. Each spot consists of three light sources, red, green, and blue. The two dimension arrangement of pixels are called resolution of the screen.

Digital camera has sensors that can produce voltages for the three color channels. This is one way of digitalizing pictures. A computer can process the picture by modifying the values of the color channels of the pixels of the picture.

## Processing Pictures
See the code for loading and displaying a picture in `src/lectures/chapter5/DisplayPicture.java`.

The creation expression (line 21) creates a picture object by loading its pixels from a data file stored on disk. The Picture constructor presents an open dialog to allow the user to select a picture file—a file with the .jpg extension.

### Grayscale
When light intensity is low, what we see is produced solely by the rods, another type of sensor, in the eye. That means we can only see a grayscale picture when the light is low. In RGB color representation, gray is perceived when we have the same value on each of the color channels.

See code in `src/lectures/chapter5/Grayscale.java`.

A `while` loop (also called indefinite loop or conditional loop) has the following format:
```java
while (condition){
    body
};
```
It repeats the `body` as long as the `condition` is `true`. `condition` is a boolean expression which evaluates to be either `true` or `false`. A `while` loop is a good choice in this case because we usually don't know the number of pixels in a picture beforehand.

## The PictureDisplay, Picture and Pixel Classes
This section is a quick introduction to there three classes and their methods used in `src/lectures/chapter5/Grayscale.java`.

## Conditional Processing
In the previous make grayscale example, the modification of all pixels in the picture is the same. But in many other use cases, different treatments are needed for different cases. Hence we need the `if` statement which has the following format:
```java
if ( condition ){
    statements
}
```
The `condition`, as in the while loop, is an expression that evaluates to a truth value. And if the `condition` is `true`, the `statements` are executed.

`src/lectures/chapter5/RedEye.java` contains an example of combining `while` loop and `if` statement to achieve red-eye correction. It corrects the red-eye effect. The pupil appears red pupil instead of black because the light passes through the back of the pupil picking up the red color from the blood supply. The program set the color of a pixle to black when its original color is close enough to the color "RED". The closenss of two colors are measured by the color distance, which is the Euclidian distance of the color channel.

## Creating a picture
In previous examples, we modified existing pictures. In this section we write a color picker program to create a picture that a pure color in it.

See code for 