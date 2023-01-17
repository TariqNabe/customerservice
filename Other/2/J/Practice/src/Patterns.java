import java.util.Scanner;
public class Patterns
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int rows = in.nextInt();
        System.out.println("Enter number of cols :");
        int cols = in.nextInt();
        for(int i=0;i<=rows;i++)
        {
            for(int j=0;j<=cols;j++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
//Write a Java program to print the following pattern.
//- - - - -
//- - - - -
//- - - - -
//- - - - -
//- - - - -