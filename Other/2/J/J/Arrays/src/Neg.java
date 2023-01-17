import java.util.Scanner;
public class Neg
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int counterP = 0;
        int counterN = 0;
        System.out.println("Enter the array length:");
        int length = in.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array values: ");
        for(int i=0;i<array.length;i++)
        {
            array[i]=in.nextInt();
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>0)
            {
                counterP++;
            }
            else
            {
                counterN++;
            }
        }
        System.out.print("P values "+counterP+" "+"\nN values "+counterN);
    }
}
