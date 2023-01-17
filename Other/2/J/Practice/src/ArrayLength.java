import java.util.Scanner;
public class ArrayLength
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array!");
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int avg = 0;
        int k;
        for(k=0;k<arr.length;k++)
        {
            avg+=arr[k];
        }
        int s = avg/arr.length;
        System.out.println("The average value is: "+s);
        }
    }
//Write a program to find average in Java using  Array.