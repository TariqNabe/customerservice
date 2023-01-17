import java.util.Scanner;
public class Sorting
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = in.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int temp=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                     temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After sorting: ");
        for(int i=0;i<length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
