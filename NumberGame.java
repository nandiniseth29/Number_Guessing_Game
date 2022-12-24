import java.util.Scanner;
import java.lang.Math;

public class NumberGame {

    public static void main(String[] args) {

        int guess = (int) (Math.random() * 100) + 1;
        int k = 5;
        int number;
        Scanner integer = new Scanner(System.in);

        boolean correct = false;
        System.out.println(
                "My favourite number lies between 1 to 100. Can you guess the number?.\nYou have 5 tries to guess the number.");
        while (k > 0) {
            System.out.println("Enter your guess: ");
            int guess1 = integer.nextInt();
            // if the user guesses correctly, print the congratulation message and exit the
            // program
            if (guess1 == guess) {
                correct = true;
                System.out.println("You guessed the number!\nYou win!");
                break;
            }

            // if the user guesses greater than the number, print the message and reduce the
            // number of
            // trials
            else if (guess1 > guess) {
                System.out.println("Your guess is too high.\nYou have " + (k - 1) + " tries left.");

            }
            // if the user guesses less than the number, print the message and reduce the
            // number of
            // trials
            else {
                System.out.println("Your guess is too low.\nYou have " + (k - 1) + " tries left.");
            }
            // after each trial decrease the number of trials by 1
            k--;
        }
        // if the user has run out of trials, print the message and exit the program

        if (correct == false) {
            System.out.println("You ran out of tries.\nYou lose! Actual Number = " + guess);
        }
    }
}
