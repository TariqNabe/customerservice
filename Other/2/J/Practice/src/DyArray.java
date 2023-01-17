import java.util.Scanner;
public class DyArray
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a length of Array: ");
        int length = in.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements of Array: ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter a number to find position index: ");
        int index = in.nextInt();
        System.out.println("The index of "+index+" is -> " + findIndex(arr,index));
    }
    public static int findIndex(int[] arr, int index)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==index)
                return i;
            else i=i+1;
        }
        return arr.length-1;
    }
}
