package exercises.chapter6;

import java.lang.Math;

/**
 * In the dice game craps, a pair of dice is repeatedly rolled. If on the first
 * roll the total on the dice is 7, the shooter wins. Write a program that
 * simulates a number of trials (a constant say 1000) of rolling a pair of dice
 * and computes and displays to the console (System.out) the proportion of times
 * that the count is seven. This is an approximation of the probability of
 * winning in the game of craps on the first roll. The roll of a single dice can
 * be simulated by generating a random number between 1 and 6 using the random
 * function of the java.lang.Math library.
 * 
 */
public class Exercise2 {

    public Exercise2() {
        displayProbability(10000);
    }

    private void displayProbability(int times) {
        int firstRoll, secondRoll, count = 0;
        for (int i = 0; i < times; i++) {
            firstRoll = (int) (6 * Math.random()) + 1;
            secondRoll = (int) (6 * Math.random()) + 1;
            if (firstRoll + secondRoll == 7) {
                count++;
            }
        }

        System.out.println("The shooter win " + count + " times in " + times + " games.");

    }

    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();
    }

}
