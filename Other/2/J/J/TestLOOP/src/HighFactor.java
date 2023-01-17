import java.util.Scanner;
public class HighFactor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b,high=0;
        System.out.print("Enter first number:");
        a=in.nextInt();
        System.out.print("Enter second number:");
        b=in.nextInt();

        for(int i=1; i<=a || i<=b; i++)
        {
            if(a%i ==0 &&b%i==0)
            {
                high=i;
            }
        }
        System.out.println("Highest of given two numbers is: "+high);
    }
}
