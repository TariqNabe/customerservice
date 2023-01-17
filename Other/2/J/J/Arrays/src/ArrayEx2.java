import java.util.Scanner;
public class ArrayEx2
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int first = in.nextInt();
        int[] second = new int[first];
        for(int i=0;i<second.length;i++)
        {
            second[i] = in.nextInt();
        }
        int[] third = second;
        for(int i=0;i<third.length;i++)
        {
            System.out.println("The array elements are: "+third[i]);
        }
    }
}