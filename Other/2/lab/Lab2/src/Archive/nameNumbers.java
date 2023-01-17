import java.util.Scanner;
public class nameNumbers {
    public static void main(String [] args)
    {
            Scanner in = new Scanner(System.in);
            System.out.println("What's your name? ");
                  String name = in.nextLine();

            System.out.println("Enter x value? ");
                  double xx = in.nextInt();
            System.out.println("Enter y value? ");
                  double yy = in.nextInt();
                  System.out.println("User's name is " + name);
            System.out.println("User entered x = " + xx + " and y = " + yy);
            System.out.println(xx + yy);
            System.out.println(xx - yy);
            System.out.println(xx * yy);
            System.out.println(xx / yy);


    }
}
