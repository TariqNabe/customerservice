import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of Array 1:");
        int lengthOne = in.nextInt();
        int arr[] = new int[lengthOne];
        System.out.println("Enter elements of Array 1:");
        for(int i=0;i<lengthOne;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter length of Array 2:");
        int lengthTwo = in.nextInt();
        int arr2[] = new int[lengthTwo];
        System.out.println("Enter elements of Array 2:");
        for(int i=0;i<lengthTwo;i++)
        {
            arr2[i]=in.nextInt();
        }
        int arr3[] = new int[lengthOne+lengthTwo];
        for(int i=0;i<1;i++)
        {
            arr3[i] = arr[i]+arr2[i];
            System.out.println(arr3[i]);
        }
    }
}
//Write a program to merge two arrays in Java
