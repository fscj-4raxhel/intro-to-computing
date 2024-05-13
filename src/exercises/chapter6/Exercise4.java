package exercises.chapter6;

/**
 * A prime number is an integer greater than 1 that is evenly divisible by only
 * * itself and 1. The integers: 2, 3, 5, 7, 11, 13, 17, 19 are all primes.
 * Write * a program that lists to the console (System.out) all the prime
 * numbers up to * a maximum (say 100). The first prime is 2. After that each
 * prime is an odd * number (else it is divisible by 2). A number (p) can be *
 * tested to determine * if it is prime by dividing by each consecutive odd
 * number * (d) from 3 up to * p. If any d evenly divides p (p%d == 0), the
 * number is not * prime. *
 */

public class Exercise4 {

    public Exercise4() {
        listPrime(100);
    }

    public void listPrime(int maxNum) {
        boolean isPrime;
        for (int i = 2; i < maxNum; i++) {
            isPrime = true;
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime)
                System.out.print(i + "  ");
        }
    }

    public static void main(String[] args) {
        Exercise4 e4 = new Exercise4();
    }
}