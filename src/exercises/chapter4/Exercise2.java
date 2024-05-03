package exercises.chapter4;

/**
 * 
 * Write a program that will display to the console a table of temperatures in
 * °F (degrees Fahrenheit) and the equivalent temperature in °C (degrees
 * Celsius) from -40 °F to 210 °F in increments of 10 °F. Use the formula:
 * C = 5/9(F - 32)
 * 
 */
public class Exercise2 {
    public static void main(String[] args) {
        int f = -40;
        double c;
        for (; f <= 210; f++) {
           c = 5.0 / 9 * (f - 32); 
           System.out.println(f + "°F is " + c + "°C");
        }
    }
}
