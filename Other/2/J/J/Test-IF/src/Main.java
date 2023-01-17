import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       System.out.print("Enter first string: ");
       String input1 = in.nextLine();
        System.out.print("Enter second string: ");
        String input2 = in.nextLine();

       if(input1.equals(input2))
       {

               System.out.println("Strings are same");

       }
       else
        {
            System.out.println("Strings aren't same");
        }


    }
}
