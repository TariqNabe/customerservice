import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size for array one: ");
        int length = in.nextInt();
        int arr1[]=new int[length];
        System.out.println("Enter elements of array one: ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the size for array two: ");
        int length2 = in.nextInt();
        int arr2[]=new int[length];
        System.out.println("Enter elements of array two: ");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=in.nextInt();
        }
        int sum=0;
        for(int k=0;k<arr1.length||k< arr2.length;k++)
        {
           sum+=arr1[k];
            sum+=arr2[k];
        }
        System.out.println("The sum of this array is:"+sum);
    }
    }

//Write a Java Program to  find the sum of array elements.