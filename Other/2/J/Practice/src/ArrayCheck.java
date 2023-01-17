import java.util.Scanner;
public class ArrayCheck
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of Array: ");
//        int length = in.nextInt();
//        int arr[] = new int[length];
//        System.out.println("Enter elements of array: ");
//        for(int i=0;i<arr.length;i++)
//        {
//            arr[i]=in.nextInt();
//        }
        int arr[] = {3,2,4,5,6,7,8,9,88,77,66,55,44,33,22,11};
        System.out.println("Enter element to look up! ");
        int look = in.nextInt();
        for(int i=0;i<1;i++)
        {
            if(look==arr[i])
            {
                System.out.println("The match found -> " + look);
            }
            else
            {
                System.out.println("The match wasn't found, try again!");
            }
        }
    }
}
//Write a Java program to test if an array contains a specific value.
