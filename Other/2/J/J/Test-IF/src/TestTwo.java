import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String input1 = in.nextLine();
        if(input1.equals(""))
        {
            System.out.println("String is empty");
        }
        else
        {
            System.out.println(input1);
        }

    }
}