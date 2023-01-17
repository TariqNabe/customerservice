import java.util.Arrays;
import java.util.Scanner;
public class DynamicPractice
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of Array 1:");
        int length1=in.nextInt();
        int arr1[]= new int[length1];
        System.out.println("Enter elements of Array 1:");
        for(int i=0;i<length1;i++)
        {
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter length of Array 2:");
        int length2=in.nextInt();
        int arr2[]= new int[length2];
        System.out.println("Enter elements of Array 2:");
        for(int i=0;i<length2;i++)
        {
            arr2[i]=in.nextInt();
        }
        int arr3[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
        }
        for(int i=0,j= arr1.length;j<(arr1.length+ arr2.length);i++,j++)
        {
            arr3[j]=arr2[i];
        }
        System.out.println("Array 1 :"+ Arrays.toString(arr1));
        System.out.println("Array 2 :"+ Arrays.toString(arr2));
        System.out.println("Array 3 :"+ Arrays.toString(arr3));
    }
}
