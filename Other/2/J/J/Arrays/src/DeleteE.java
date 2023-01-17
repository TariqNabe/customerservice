import java.util.Scanner;
public class DeleteE
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = in.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter array elements: ");
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The elements are: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter an element to be deleted! ");
        int getE = in.nextInt();
        int flag=0;
        int loc=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==getE)
            {
               flag=1;
               loc=i;
               break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            for(i=loc+1;i<arr.length;i++)
            {
                arr[i-1]=arr[i];
            }
            System.out.print("After deleting ");
            for(i=0;i<arr.length-2;i++)
            {
                System.out.print(arr[i]+",");
            }
            System.out.println(arr[length-2]);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
