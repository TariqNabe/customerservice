import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a number");
         int num = in.nextInt();


         for(int i=1; i<=num; i=i+1)
         {
             for(int j=1; j<=num; j=j+1)
             {
                 System.out.print("*");
             }
             System.out.println("");
         }


    }
}
