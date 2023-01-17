import java.util.Scanner;
/*
        Write a do-while loop that asks the user to enter two numbers.
        The numbers should be added and the sum displayed.
        The loop should ask the user whether he or she wishes to perform the operation again.
        If so, the loop should repeat; otherwise it should terminate.
*/
public class TestOne
{
    public static void main(String[] args)
    {
        char choice;
        Scanner console = new Scanner(System.in);
        do {
            System.out.println("Enter number one: ");
            int numberOne = console.nextInt();
            System.out.println("Enter number two: ");
            int numberTwo = console.nextInt();
            int allNumbers = numberOne * numberTwo;
            System.out.println("The sum of these numbers is: " + allNumbers);
            System.out.println("Please enter Y to repeat again: ");
            choice = console.next().charAt(0);
        }while(choice=='y' || choice =='Y');
    }
}
