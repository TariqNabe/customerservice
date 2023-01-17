import java.util.Scanner;
public class Copy
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int length = in.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements of Array:");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int arr1[]=arr;
        for(int i=0;i< arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
//Write a Java program to copy an array by iterating the array.
