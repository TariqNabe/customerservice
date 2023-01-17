import java.util.Scanner;
import java.util.Arrays;
public class Reverse
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int size =0;
        System.out.println("Enter the array size: ");
        size = in.nextInt();
        int numbers[] = null;
        int rev[] = null;
        numbers = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++)
        {
          numbers[i]=in.nextInt();
        }
        rev=reverse(numbers);
        System.out.println("Reverse of the Array is:"+Arrays.toString(rev));
    }
    public static int[] reverse(int[] numbers)
    {
        int s=0;
        int []reverse = null;
        s=numbers.length;
        reverse=new int[s];
        int i=0,j=s-1;
        while(i<s)
        {
            reverse[i]=numbers[j];
            i++;
            j--;
        }
        return reverse;
    }
}
