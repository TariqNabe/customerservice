import java.util.Scanner;
public class EvenAndOdd
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        char choice;
        int evenSum = 0, oddSum = 0;
        do {
            System.out.println("Enter a number to determine if it is odd or even: ");
            int a = in.nextInt();
            if(a%2==0)
            {
                evenSum+=a;
            }
            else
            {
                oddSum+=a;
            }
            System.out.println("Would like to continue, if yes press y: ");
            choice = in.next().charAt(0);
        }while((choice == 'y') || (choice == 'Y'));
        System.out.print("odd number of sum:"+oddSum);
        System.out.print("\nEven number of sum:"+evenSum);
    }
}
