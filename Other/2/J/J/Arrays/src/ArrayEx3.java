import java.util.Scanner;
public class ArrayEx3
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.println("Enter a values to be stored in array:");
        for(int i=0;i<array.length;i++)
        {
             array[i] = in.nextInt();
        }
        int total = 0;
        for(int i=0;i<array.length;i++)
        {
            total+=array[i];
        }
        System.out.println("The total is: " + total);
        int avg = 0;
        avg = total/array.length;
        System.out.println("The average is: " + avg);
    }
}
