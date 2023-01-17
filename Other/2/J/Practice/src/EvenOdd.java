import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int length=in.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements of array: ");
        int arr1[]=new int[length];
        int arr2[]=new int[length];
        for(int i=0;i<length;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<length;i++)
        {
            if(arr[i]%2==0)
            {
                arr1[i]=arr[i];
                System.out.print(arr1[i]+",");
            }
            else
            {
                arr2[i]=arr[i];
                System.out.print("\n"+arr2[i]+",");
            }
        }
    }
}
