import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an input");
        int digit = in.nextInt();
        String digitName;

        switch(digit)
        {
            case 1:
                digitName = "one";
                System.out.print(digitName);
                break;
            case 2:
                digitName = "two";
                System.out.print(digitName);
                break;
            case 3:
                digitName = "three";
                System.out.print(digitName);
                break;
            case 4:
                digitName = "four";
                System.out.print(digitName);
                break;

            default:
                digitName=" ";
                System.out.print(digitName);
                break;
        }

    }
}
