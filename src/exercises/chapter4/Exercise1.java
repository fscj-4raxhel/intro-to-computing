package exercises.chapter4;

/**
 * Rewrite Example_4_1 to sum ⅓ three hundred times, ¼ four hundred times and ⅛
 * eight hundred times. Comment on the results.
 * 
 * This class demonstrates the accumulated round-off error with different
 * examples
 */

public class Exercise1 {

    public Exercise1() {
        System.out.println("Sum 1/3 three hundred times is: " + sumDouble(1.0 / 3, 300));
        System.out.println("Sum 1/4 four undred times is: " + sumDouble(1.0 / 4, 400));
        System.out.println("Sum 1/8 eight hundred times is: " + sumDouble(1.0 / 8, 800));
    }

    /**
     * This method sum a given value x the t times and print the result.
     * There will be accumalated round-off error.
     * 
     * @param x
     * @param times
     */
    public double sumDouble(double x, int t) {
        double sum = 0;

        for (int i = 0; i < t; i++) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
    }
}
