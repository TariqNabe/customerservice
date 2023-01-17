import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        int num = in.nextInt();
        System.out.println("Enter width");
        int num2 = in.nextInt();

        for(int i=1; i<=num2; i=i+1)
        {
            for(int j=1; j<=num; j=j+1)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
