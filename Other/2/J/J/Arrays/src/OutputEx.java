import java.util.Scanner;

public class OutputEx
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the ARRAY size: ");
        int size = in.nextInt();
        int [] array = new int[size];
        System.out.print("Enter the ARRAY elements: ");
        for(int i=0;i<array.length;i++)
        {
            array[i] = in.nextInt();
        }
        for(int j=0;j<array.length;j++)
        {
            System.out.printf("%d,",array[j]);
        }
    }
}
