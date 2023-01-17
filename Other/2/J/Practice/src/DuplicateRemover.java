import java.util.Scanner;
public class DuplicateRemover
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int arr1[]={11,22,33,44,55,66,77,88,99,00,213,313,414,515,616,717,818};
        for(int i=0;i< arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nEnter element to be deleted !");
        int check= in.nextInt();
        for(int i=0;i<arr1.length;i++)
        {
            if(check!=arr1[i])
            {
                System.out.print(arr1[i]+" ");
            }
        }
    }
}
