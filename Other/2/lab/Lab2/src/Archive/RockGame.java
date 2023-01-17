import java.util.*;

public class RockGame {
    public static void main(String []args)
    {
            final String rock = "R";
            final String paper = "P";
            final String scissors = "S";
            final String winner = "";

            Scanner in = new Scanner(System.in);
            System.out.println("To play rock-paper-scissors." +
                    " Pick Rock (R), Paper (P), or\n" +
                    "Scissors (S)");
            System.out.println("Enter the name of player one: ");
            String name = in.nextLine();

            System.out.println("Enter the choice: ");
            String choice = in.nextLine();

            System.out.println("Enter the name of player two: ");
            String nameTwo = in.nextLine();

            System.out.println("Enter the choice: ");
            String choiceTwo = in.nextLine();
       //Rock beats Scissors, Scissors beats Paper, but Paper beat Rock.
        if (choice.equals(choiceTwo))
        {
            System.out.println("A tie");
        }
        else if (choice.equals(rock))
        {
            System.out.println(name);
        }
        else if (choiceTwo.equals(scissors))
        {
            System.out.println(nameTwo);
        }

        else if (choice.equals(scissors))
        {
            System.out.println(name);
        }
        else if (choiceTwo.equals(paper))
        {
            System.out.println(nameTwo);
        }
        else if (choice.equals(paper))
        {
            System.out.println(name);
        }
        else if (choiceTwo.equals(rock))
        {
            System.out.println(nameTwo);
        }


    }
}
