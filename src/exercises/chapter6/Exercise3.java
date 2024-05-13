package exercises.chapter6;

/**
 * Write a program that computes the square root of a number (a) to within the
 * degree of accuracy indicated by a tolerance (both constants). A recurrence
 * relation for square root of a is:
 * 
 * x_{n+1} = 1/2 (x_{n} + a / x_{n})
 * 
 * That is the next approximation (x_{n+1}) is computed from the last
 * approximation (x_{n}) according to the formula. Starting with a first
 * approximation of a/2, apply the formula until the square of the new
 * approximation is within the specified tolerance of a.
 * 
 */
public class Exercise3 {

    private static final double tolerance = 0.001;

    public Exercise3() {
        double a = 2;
        System.out.println("The square root of " + a + " is " + sqrtRoot(a, tolerance));
    }

    public double sqrtRoot(double a, double tolerance) {
        double approximation = a / 2;
        while (Math.abs(approximation * approximation - a) > tolerance) {
            approximation = 0.5 * (approximation + a / approximation);
        }
        return approximation;
    }

    public static void main(String[] args) {
        Exercise3 e3 = new Exercise3();
    }
}