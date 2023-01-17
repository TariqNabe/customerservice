import java.util.Scanner;
public class EvenOdArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = in.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i< array.length;i++)
        {
            array[i]=in.nextInt();
        }
        for(int i=0;i< array.length;i++)
        {
            if(array[i]%2==0)
            {
                System.out.println("The even :"+array[i]);
            }
            else
            {
                System.out.println("The odd :"+array[i]);
            }
        }
    }
}
