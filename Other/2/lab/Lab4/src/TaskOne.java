import java.util.Scanner;
public class TaskOne {

    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
                    System.out.println("Enter a number");
                    int num = in.nextInt();

                    int i=1;
                    while(i<=num)
                    {
                        System.out.print("*");
                        i++;
                    }


    }
}
