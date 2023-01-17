import java.util.Arrays;
import java.util.Scanner;
public class SortedArraysDynamic
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array1:");
        int length1=in.nextInt();
        int arr1[]=new int[length1];
        System.out.println("Enter elements of array1: ");
        for(int i=0;i<length1;i++)
        {
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter length of array2:");
        int length2=in.nextInt();
        int arr2[]=new int[length2];
        System.out.println("Enter elements of array2: ");
        for(int i=0;i<length2;i++)
        {
            arr2[i]=in.nextInt();
        }
        int arr3[]=new int[arr1.length+ arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
