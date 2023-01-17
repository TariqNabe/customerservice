import java.util.Arrays;

public class SortedArray
{
    public static void main(String[] args)
    {
        int arr1[]={40,20,50,10,50};
        int arr2[]={100,90,70,80,60};
        int arr3[] = new int[arr1.length+ arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
//Write a program to merge two sorted arrays in Java