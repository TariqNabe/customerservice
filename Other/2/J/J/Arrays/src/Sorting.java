import java.util.Scanner;
public class Sorting
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = in.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter the elements of array: ");
        int i;
        //Elements Entering :
        for(i=0;i<arr1.length;i++)
        {
            arr1[i]=in.nextInt();
        }
        //Logic using nested for loop
        for(i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temporary = arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temporary;
                }
            }
        }
        System.out.println("Array after Sorting:");
        for(i=0;i<size;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
