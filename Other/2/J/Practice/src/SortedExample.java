import java.util.Arrays;
import java.util.Scanner;
public class SortedExample
{
    public static void main(String[] args)
    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter length of array:");
//        int length = in.nextInt();
        int arr[]= {44,22,11,55,88,99,321,43212,42414,314,31,431,4,31};
//        System.out.println("Enter elements of array: ");
//        for(int i=0;i<length;i++)
//        {
//            arr[i]=in.nextInt();
//        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
