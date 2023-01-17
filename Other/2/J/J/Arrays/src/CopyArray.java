import java.util.Scanner;
public class CopyArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<array.length;i++)
        {
            array[i]=in.nextInt();
        }
        int[] second = array;
        for(int i=0;i<array.length;i++)
        {
            second[i] = array[i];
            System.out.print(second[i]+" ");
        }
//        int[] array = {33,22,44,55,21,32,43,52,26,17,48,39};
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.print(array[i]+" ");
//        }
//        int[] second =array;
//        System.out.println(" ");
//        for(int i=0;i<array.length;i++)
//        {
//            second[i] = array[i];
//            System.out.print(second[i]+" ");
//        }
    }
}
