package exercises.chapter6;

/**
 * 
 * Write a program that prints a numeric triangle to the console (System.out).
 * For a single digit number, it prints a sequence of lines each repeating the
 * digit one more time up to the number, and then each with one less digit back
 * to one, making a triangular pattern. For example, for the number 5, the
 * program would print:
 * 
 */
public class Exercise1 {

    public Exercise1() {
        printTriangle(5);
    }

    private void printTriangle(int digit) {
        for (int i = 1; i < digit; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(digit + "  ");
            }
            System.out.println();
        }

        for (int i = digit; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(digit + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
    }
}
