

import java.util.Scanner;
import java.util.Random;


public class GuessingGame {

    public static void main(String[] args) {

        //Object of Scanner
        Scanner in = new Scanner(System.in);
        //Object of random
        Random rand = new Random();

        //Initialization Random and assign it
        int guessNumber = rand.nextInt(100);

        //Ask the player 1 name
        System.out.println("Enter player 1 name: ");
        //Initialization name1 and assign it with scanner
        String name1 = in.nextLine();

        //Ask the player 2 name
        System.out.println("Enter player 2 name: ");
        //Initialization name2 and assign it with scanner
        String name2 = in.nextLine();

        System.out.println("Hmmmmm, let me think of a number between 1 and 100\n"
                + "Alright, I have thought of a number.");

        //Ask player 1 to enter a number between 1-100 as well as player 2 by following code with initialization
        System.out.println(name1 + " enter your guess: ");
        int guess1 = in.nextInt();

        System.out.println(name2 + " enter your guess: ");
        int guess2 = in.nextInt();

        System.out.println("The secret number was " + guessNumber);

            //Calculating whether player 1 and 2 entered a value is bigger or lower than guess number using if statement.
        if (guessNumber > guess1) {
            System.out.println(name1 + " had " + guess1 + " with a difference of "
                    + guessNumber + " - " + guess1 + " = " + Math.abs(guessNumber - guess1));
        } else if (guessNumber < guess1) {
            System.out.println(name1 + " had " + guess1 + " with a difference of "
                    + guess1 + " - " + guessNumber + " = " + Math.abs(guessNumber - guess1));
        }
        if (guessNumber > guess2) {
            System.out.println(name2 + " had " + guess2 + " with a difference of "
                    + guessNumber + " - " + guess2 + " = " + Math.abs(guessNumber - guess2));
        } else if (guessNumber < guess2) {
            System.out.println(name2 + " had " + guess2 + " with a difference of "
                    + guess2 + " - " + guessNumber + " = " + Math.abs(guessNumber - guess2));
        }

       /*
       This block of code defines the final winner based on the structures that was given,
                and the logic to handle it correctly.
        */

        //If both players guess the same number, the first player wins
        if (guess1 == guessNumber && guess2 == guessNumber)
        {
            System.out.println(name1 + " wins!!!");

        }
        //General case
        else if (Math.abs(guessNumber - guess1) < Math.abs(guessNumber - guess2))
        {
            System.out.println(name1 + " wins!!!");

        }
        else if(Math.abs(guessNumber - guess1) > Math.abs(guessNumber - guess2))
        {
            System.out.println(name2 + " wins!!!");
        }
        // Edge case
        else if (Math.abs(guessNumber - guess1) == Math.abs(guessNumber - guess2))
        {

            if (guess1 < guessNumber)
            {
                if(guess2 < guessNumber)
                {
                    System.out.println("Since both scores are equal, the winner is " +
                            "the one who guessed the lower number wins, and that happens to be " + name2 + " .");
                    System.out.println(name2 + " wins!!!");
                }
            }
            else
            {
                System.out.println("Since both scores are equal, the winner is " +
                        "the one who guessed the lower number wins, and that happens to be " + name1 + " .");
                System.out.println(name1 + " wins!!!");
            }
        }

    }//end of code
    }// end of program
