import java.util.Scanner;

public class IfPractice {
   public static void main(String[] args)
   {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the first input: ");
            int number1 = in.nextInt();

            System.out.println("Enter the second input: ");
            int number2 = in.nextInt();

         System.out.println(number1);
         System.out.println(number2);


       if(!in.hasNextInt())
       {
           System.exit(0);
       }

   }

}
