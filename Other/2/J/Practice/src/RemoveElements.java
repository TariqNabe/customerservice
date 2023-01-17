import java.util.Scanner;
public class RemoveElements
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a length of Array: ");
        int length = in.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements of Array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
//        int arr[] = {11,22,33,44,55,66,77,88,99};
        for(int k=0;k< arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
        System.out.println("\nEnter element to be removed!");
        int delete = in.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(delete==arr[i])
            {
                System.out.println(arr[i]+" was deleted! ");
                arr[i] = arr[i]-delete;
            }
        }
        for(int k=0;k< arr.length;k++)
        {
                System.out.print(arr[k]+" ");
        }
    }
}
