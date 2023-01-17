import java.util.Scanner;
public class TaskOne
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number upto which Fibonacci series: ");
        int x = in.nextInt();
        System.out.println("Fibonacci series up to this number: " + x + " numbers");
        for (int i=1; i<=x; i++)
        {
            System.out.println(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int number)
    {
        if (number == 1 || number == 2)
        {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2); 
    }
}
