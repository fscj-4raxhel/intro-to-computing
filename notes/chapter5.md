# Pictures
Computer graphics is the study of creation and manipulation of images, still and moving. The most common representation of picture is as pixels, which are made up of RGB-triples. Manipulation of picture is then the modifiction of the color of pixels. And this process involes a sequencing through a collection. We will use a while loop to iterate the pixels of the picture and use if statement to decide whether or not to perform some actions.

## Representing Pictures
Part of the electromagnetic specturm is light. From 370 -- 730 nanometer is the range of visible light. Human beings can see this part of spectrum.

There are three sensors called cones in human eyes that preceive different wavelength and send electric current with different voltage to the brain which then interpretate it into color. The three cones have different sensitivity to the same wavelength, one send high voltage for blue light, one for green light and one for red light. And even with single wavelength light, all three sensors send currents. So the natural representation of light in computer is to use a RGB triple with three color channels. We use one byte to represent each channel so the value varies from 0 to 255. As a result $256^3 = 16,777,216$ colors can be represented in computre while human eyes can recognize around $10,000,000$ colors.

Then three light sources are close enough together, they appear to the eyes as one color instead of three. Using this priciple a television or computer screen is designed as a matrix of spots, called pixels. Each spot consists of three light sources, red, green, and blue. The two dimension arrangement of pixels are called resolution of the screen.

Digital camera has sensors that can produce voltages for the three color channels. This is one way of digitalizing pictures. A computer can process the picture by modifying the values of the color channels of the pixels of the picture.