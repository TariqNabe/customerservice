import java.util.Scanner;
public class FindSmall
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<array.length;i++)
        {
            array[i]=in.nextInt();
        }
        int min = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(min > array[i])
            {
                min=array[i];
            }
        }
        System.out.println("The smallest value is : "+min);
    }
}
