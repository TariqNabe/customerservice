import java.util.Scanner;
public class TaskFive {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number one");
        int value1 = in.nextInt();

        System.out.println("Enter number one");
        int value2 = in.nextInt();

        int total = showSum(value1, value2);
        System.out.println("the sum of "+value1+ " and " + value2 + " is " + total);


    }
    public static int showSum(int num1, int num2)
    {
        int result = num1 + num2;
        return result;

    }
}
