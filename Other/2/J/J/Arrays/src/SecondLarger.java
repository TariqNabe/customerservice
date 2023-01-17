import javax.swing.plaf.SeparatorUI;
import java.util.Scanner;
public class SecondLarger
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i< array.length;i++)
        {
            array[i]=in.nextInt();
        }
        int i=0;
        int first=0;
        int snd=0;
        int Position=0;
        for(i = 0; i < size; i++)
        {
            if(array[i] > first) {
                snd = first;
                first = array[i];
                Position = i;
            }
            else if(array[i] > snd && array[i] < first)
            {
                snd = array[i];
            }
        }
        System.out.format("\nMaximum Value in Array    = %d", first);
        System.out.format("\nMaximum Value Index position  = %d", Position);
        System.out.format("\n\nSecond Largest Item in Array  = %d", snd);
    }
}
