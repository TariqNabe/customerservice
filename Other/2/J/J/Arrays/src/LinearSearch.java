import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of ARRAY: ");
        int size = in.nextInt();
        int [] array = new int[size];
        System.out.println("Enter the elements of ARRAY: ");
        for(int i=0;i<array.length;i++)
        {
            array[i]=in.nextInt();
        }
        System.out.println("Enter the element of SEARCH: ");
        int search = in.nextInt();
        int j;
        for(j=0;j<array.length;j++)
        {
            if(search==array[j])
            {
                System.out.printf(array[j]+" search presented in location "+(j+1));
                break;
            }
        }
        if(j==size)
        {
            System.out.println("Element isn't present! ");
        }
    }
}
