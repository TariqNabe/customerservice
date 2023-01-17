import java.util.Arrays;
import java.util.Scanner;
public class Swapping
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        //static
//        int arr1[]= {11,22,33,44,55,66,77};
//        int arr2[]= {1,2,3,4,5,6,7};
//        if(arr1.length==arr2.length)
//        {
//            int temporary;
//            for(int i=0;i<arr2.length;i++)
//            {
//                temporary=arr1[i];
//                arr1[i]=arr2[i];
//                arr2[i]=temporary;
//            }
//        }
//        else
//        {
//            System.out.println("The length isn't same!!");
//        }
//        System.out.println("Array1: "+ Arrays.toString(arr1));
//        System.out.println("Array2: "+ Arrays.toString(arr2));


        //Dynamic
        System.out.println("Enter array length 1:");
        int length = in.nextInt();
        int arr1[] = new int[length];
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter array length 2:");
        int length2 = in.nextInt();
        int arr2[] = new int[length];
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=in.nextInt();
        }
        if(arr1.length==arr2.length)
        {
            int temporary;
            for(int i=0;i<arr2.length;i++)
            {
                temporary=arr1[i];
                arr1[i]=arr2[i];
                arr2[i]=temporary;
            }
        }
        else
        {
            System.out.println("The length isn't same!!");
        }
        System.out.println("Array1: "+ Arrays.toString(arr1));
        System.out.println("Array2: "+ Arrays.toString(arr2));
    }
}