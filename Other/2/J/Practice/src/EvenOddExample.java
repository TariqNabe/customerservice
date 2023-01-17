import java.util.Arrays;
import java.util.Scanner;
public class EvenOddExample
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int length = in.nextInt();
        int numbers[]=new int[length];
        System.out.println("Enter the array elements:");
        for(int i=0;i<length;i++)
        {
            numbers[i]=in.nextInt();
        }
        display(numbers);
    }
    public static void display(int numbers[])
    {
        int even =0,odd=0;
        int eve[]=null;
        int od[]=null;
        for(int i:numbers)
        {
            if(i%2==0)
            {
                ++even;
            }
        }
        odd=numbers.length-even;
        eve=new int[even];
        od=new int[odd];
        int i=0,j=0;
        for(int num:numbers)
        {
            if(num%2==0)
            {
                eve[i++]=num;
            }
            else
            {
                od[j++]=num;
            }
        }
        System.out.println("Even Numbers"+ Arrays.toString(eve));
        System.out.println("Odd Numbers"+ Arrays.toString(od));
    }
}

