import java.util.Scanner;
public class operation
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of array1:");
       int size = in.nextInt();
       int[] array = new int[size];
       int i;
       System.out.println("Enter the values of Array1:  ");
       for(i=0;i<array.length;i++)
       {
           array[i]=in.nextInt();
       }
       System.out.println("Enter the size of array2:");
       int size2 = in.nextInt();
       int[] array2 = new int[size];
       int j;
       System.out.println("Enter the values of Array2: ");
       for(j=0;j<array2.length;j++)
       {
           array2[j]=in.nextInt();
       }
       int[] add = new int[size];
       int[] sub = new int[size];
       int[] mul = new int[size];
       int[] div = new int[size];
       int[] mod = new int[size];
       for(int k=0;k<array.length;k++)
       {
           add[k]=array[k]+array2[k];
           sub[k]=array[k]-array2[k];
           mul[k]=array[k]*array2[k];
           div[k]=array[k]/array2[k];
           mod[k]=array[k]%array2[k];
       }
       System.out.println("The values of Addition: ");
       for(i=0;i<array.length;i++)
       {
           System.out.print(add[i]);
       }
       System.out.println("The values of subtraction: ");
       for(i=0;i<array.length;i++)
       {
           System.out.print(sub[i]);
       }
       System.out.println("The values of multiplication: ");
       for(i=0;i<array.length;i++)
       {
           System.out.print(mul[i]);
       }
       System.out.println("The values of division: ");
       for(i=0;i<array.length;i++)
       {
           System.out.print(div[i]);
       }
       System.out.println("The values of modulo: ");
       for(i=0;i<array.length;i++)
       {
           System.out.print(mod[i]);
       }
   }
}
