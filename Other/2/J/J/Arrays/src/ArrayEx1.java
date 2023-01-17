import java.util.Scanner;
public class ArrayEx1
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size = in.nextInt();
        int[] first = new int[size];
        System.out.println("the elements of array are:");
        for(int i=0;i<first.length;i++)
        {
            first[i] = in.nextInt();
        }
        System.out.println("print enter elements of array are:");
        for(int i=0;i<first.length;i++)
        {
            System.out.println(first[i]);
        }
    }
}
