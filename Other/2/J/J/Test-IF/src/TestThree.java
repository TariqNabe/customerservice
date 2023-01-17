import java.util.Scanner;

public class TestThree {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first score: ");
        int score1 = in.nextInt();
        System.out.print("Enter the second score: ");
        int score2 = in.nextInt();

        if(score1>score2)
        {
            System.out.println("First score wins!");
        }
        else if(score2>score1)
        {
            System.out.print("Score two wins!");
        }
        else
        {
            System.out.println("Game is tie!!");
        }



    }
}
