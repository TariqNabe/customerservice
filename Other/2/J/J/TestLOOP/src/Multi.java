import java.util.Scanner;
public class Multi
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the multiplication table");
        int a = in.nextInt();
        for(int i=0;i<=100;i++)
        {
            System.out.println("1 * "+a+" = "+(i*a));
        }
    }
}
//highest common vector